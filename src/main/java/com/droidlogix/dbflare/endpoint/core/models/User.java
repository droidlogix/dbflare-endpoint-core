package com.droidlogix.dbflare.endpoint.core.models;

import com.droidlogix.sqlite.datahandler.ISqliteObjectAssembler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class User implements IUser, ISqliteObjectAssembler<User>
{
	private long idUser;
	private String username;
	private String pwd;
	private String name;
	private Date createdDateTime;
	private Date modifiedDateTime;
	private int incorrectLoginAttempt;
	private Date lockoutDateTime;
	private String status;

	@Override
	public long getIdUser()
	{
		return this.idUser;
	}

	@Override
	public void setIdUser(long idUser)
	{
		this.idUser = idUser;
	}

	@Override
	public String getUsername()
	{
		return this.username;
	}

	@Override
	public void setUsername(String username)
	{
		this.username = username;
	}

	@Override
	public String getPassword()
	{
		return this.pwd;
	}

	@Override
	public void setPassword(String password)
	{
		this.pwd = password;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public Date getCreatedDateTime()
	{
		return this.createdDateTime;
	}

	@Override
	public void setCreatedDateTime(Date createdDateTime)
	{
		this.createdDateTime = createdDateTime;
	}

	@Override
	public Date getModifiedDateTime()
	{
		return this.modifiedDateTime;
	}

	@Override
	public void setModifiedDateTime(Date modifiedDateTime)
	{
		this.modifiedDateTime = modifiedDateTime;
	}

	@Override
	public int getIncorrectLoginAttempt()
	{
		return incorrectLoginAttempt;
	}

	@Override
	public void setIncorrectLoginAttempt(int count)
	{
		this.incorrectLoginAttempt = count;
	}

	@Override
	public Date getLockoutDateTime()
	{
		return this.lockoutDateTime;
	}

	@Override
	public void setLockoutDateTime(Date lockoutDateTime)
	{
		this.lockoutDateTime = lockoutDateTime;
	}

	@Override
	public String getStatus()
	{
		return this.status;
	}

	@Override
	public void setStatus(String status)
	{
		this.status = status;
	}

	@Override
	public User assemble(ResultSet resultSet) throws SQLException
	{
		if(!resultSet.isClosed())
		{
			User user = new User();
			user.setIdUser(resultSet.getLong("idUser"));
			user.setUsername(resultSet.getString("username"));
			user.setPassword(resultSet.getString("pwd"));
			user.setName(resultSet.getString("name"));
			user.setCreatedDateTime(resultSet.getDate("createdDateTime"));
			user.setModifiedDateTime(resultSet.getDate("modifiedDateTime"));
			user.setIncorrectLoginAttempt(resultSet.getInt("incorrectLoginAttempt"));
			user.setLockoutDateTime(resultSet.getDate("lockoutDateTime"));
			user.setStatus(resultSet.getString("status"));
			return user;
		}
		return null;
	}
}
