package com.gr.geias.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 拦截登录，没用登录的一律返回登录页
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object person = request.getSession().getAttribute("person");
        Object employmentLogin = request.getSession().getAttribute("employmentLogin");
        if (person != null || employmentLogin != null) {
            return true;
        } else {
            response.sendRedirect("/page/login");
            return false;
        }
    }
}
