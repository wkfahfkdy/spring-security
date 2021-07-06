package co.kjm.securityPrj.common.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class UserAuthProvider implements AuthenticationProvider{

	private String userDetailsService;
	private String passwordEncoder;
	
	public String getUserDetailsService() {
		return userDetailsService;
	}

	public void setUserDetailsService(String userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	public String getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPasswordEncoder(String passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return false;
	}

}
