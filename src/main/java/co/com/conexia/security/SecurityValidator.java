package co.com.conexia.security;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class SecurityValidator {

	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception {
		Object[] parameters = ctx.getParameters();
		String param = (String) parameters[0];
		param = param.toLowerCase();
		parameters[0] = param;
		ctx.setParameters(parameters);
		
		try {
			return ctx.proceed();
			
		} catch (Exception e) {
			System.out.println("Pailas");
			return null;
		}
	}

}
