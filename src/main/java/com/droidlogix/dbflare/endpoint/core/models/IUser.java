package com.droidlogix.dbflare.endpoint.core.models;

import java.util.Date;

public interface IUser
{
	long getIdUser();

	void setIdUser(long idUser);

	String getUsername();

	void setUsername(String username);

	String getPassword();

	void setPassword(String password);

	String getName();

	void setName(String name);

	Date getCreatedDateTime();

	void setCreatedDateTime(Date createdDateTime);

	Date getModifiedDateTime();

	void setModifiedDateTime(Date modifiedDateTime);

	int getIncorrectLoginAttempt();

	void setIncorrectLoginAttempt(int count);

	Date getLockoutDateTime();

	void setLockoutDateTime(Date lockoutDateTime);

	String getStatus();

	void setStatus(String status);
}
