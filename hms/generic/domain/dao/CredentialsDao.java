package com.hms.generic.domain.dao;

import com.hms.generic.domain.authentication.User;

public interface CredentialsDao {
	public User getLoginInfo();
}

