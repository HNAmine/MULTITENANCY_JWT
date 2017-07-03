package multitenancy.org.security.service;

import java.io.Serializable;

public class JwtAuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 1250166508152483573L;

	private final String token;
    private final String tenantId;

	public JwtAuthenticationResponse(String token,String tenantId) {
		this.token = token;
		this.tenantId = tenantId;
	}

	public String getToken() {
		return this.token;
	}

	public String getTenantId() {
		return tenantId;
	}
	
}
