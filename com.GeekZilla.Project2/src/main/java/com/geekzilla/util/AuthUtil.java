package com.geekzilla.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.geekzilla.model.Users;

@Component
public class AuthUtil {
	public Users getCurrentUser() {
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return (Users) req.getSession().getAttribute("user");
	}
}
