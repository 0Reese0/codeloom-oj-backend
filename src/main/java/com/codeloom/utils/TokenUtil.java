package com.codeloom.utils;
/*
 * @author  MaRui
 * @date  2022/6/17 17:28
 * @version 1.0
 */


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.codeloom.model.domain.UserInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author MaRui
 */
@Component
public class TokenUtil{

    /**
     * 生成token
     * @param user
     * @return
     */
    public String generateToken(UserInfo user) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = "";
        token = JWT.create()
                .withAudience(user.getUuid().toString())
                .withAudience(user.getUsername())
                .withIssuedAt(start)
                .withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getPassword() ));
        return token;
    }


    /**
     *
     * @param token
     * @param key
     * @return userId
     * 获取制定token中某个属性值
     */
    public static String get(String token, String key) {
        List<String> list= JWT.decode(token).getAudience();
        String userId = JWT.decode(token).getAudience().get(0);
        return userId;
    }

    /**
     * 获取request
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }


    /**
     *
     * @param request
     * @return
     * 获取token
     */
    public String getToken(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie c :
                cookies) {
            if (c.getName().equals("token")) {
                return c.getValue();
            }
        }
        return null;
    }
}
