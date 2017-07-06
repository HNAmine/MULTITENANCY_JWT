package multitenancy.org.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import multitenancy.org.constants.CustomRequestAttributes;

public class MultitenancyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {

		String tenantId = req.getHeader("Authorization");

		if (tenantId != null) {
			req.setAttribute(CustomRequestAttributes.CURRENT_TENANT_IDENTIFIER, tenantId);
		}

		return true;
	}

}
