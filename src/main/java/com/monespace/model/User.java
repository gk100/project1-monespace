package com.monespace.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.gson.annotations.Expose;

@SuppressWarnings("serial")
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Expose
	private int userId;
	@Expose
	private String username;
	@Expose
	private String password;
	@Expose
	private boolean enabled;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
