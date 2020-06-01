package com.example;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * This servlet handles "/wbin/dreamforce/v1/video-auth" requests that are coming through IBM Ustream video channel
 * entry point of the authentication flow. The logic acts as a gate to protect video content from serving on the page.
 * The underlying logic relies on user is logged in and user has registered to the event.
 *
 * For information on IBM Video Channel API, see:
 * https://developers.video.ibm.com/channel-api/getting-started.html
 *
 * @author calvin.cheng
 * @since 2020-04
 */
@WebServlet(name = "ibm-auth", urlPatterns = {ContentAuthServlet.USTREAM_ENDPOINT_STATUS}, loadOnStartup = 1)
public class ContentAuthServlet {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    static final String USTREAM_ENDPOINT_STATUS = "/v1/ibm-auth";
    private static final String DEFAULT_KEY = "sfdcchannel";
    private static final long DEFAULT_HASH_EXPIRE = 3600; // default hash expire in seconds
    private static final String TZ_REGISTERED = "registered";


    /**
     * This servlet creates an endpoint that is used in channel authentication in IBM Ustream setup.
     *
     * Per viewer authentication flow documentated in
     * https://developers.video.ibm.com/channel-api/viewer-authentication-api.html
     * for existing and additional name/parameters that is used.
     *
     * It acts as a gate to screen users before getting the user to the video player. The authentication is through
     * TBID, then this function validates the reference request and ensure the user has 'registered' status along with
     * a registeration ID associated.
     *
     * @param request HttpServletReqeust
     * @param response HttpServletResponse
     * @throws IOException
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print("{\"key\":\"val1\"}");
        response.setStatus(200);

    }

    /**
     * Calculate the hash expiration in seconds
     *
     * @param hashExpire hash expiration time string
     * @return hash expiration time in seconds
     */
    private long getHashExpiration(String hashExpire) {
        long expiration = (System.currentTimeMillis() / 1000L) + DEFAULT_HASH_EXPIRE;
        if (StringUtils.isNotEmpty(hashExpire)) {
            expiration = (Long.parseLong(hashExpire) == -1) ? -1 : (System.currentTimeMillis() / 1000L) + Long.parseLong(hashExpire);
        }
        return expiration;
    }
}