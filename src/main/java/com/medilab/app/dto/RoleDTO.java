package com.medilab.app.dto;

import java.io.Serializable;

public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String authority;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
}
