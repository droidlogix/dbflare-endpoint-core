package com.droidlogix.dbflare.endpoint.core.models;

import com.droidlogix.sqlite.datahandler.ISqliteObjectAssembler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author John Pili
 * @since 1.0.0
 */

public class EndpointDb implements IEndpointDb, ISqliteObjectAssembler<EndpointDb>
{
	private long idEndpointDb;

	private String persistenceUnitName;

	private String databasePlatform;

	private String jdbcDriver;

	private String jdbcUrl;

	private String jdbcUsername;

	private String jdbcPassword;

	@Override
	public long getIdEndpointDb()
	{
		return idEndpointDb;
	}

	@Override
	public void setIdEndpointDb(long idEndpointDb)
	{
		this.idEndpointDb = idEndpointDb;
	}

	@Override
	public String getPersistenceUnitName()
	{
		return persistenceUnitName;
	}

	@Override
	public void setPersistenceUnitName(String persistenceUnitName)
	{
		this.persistenceUnitName = persistenceUnitName;
	}

	@Override
	public String getDatabasePlatform()
	{
		return databasePlatform;
	}

	@Override
	public void setDatabasePlatform(String databasePlatform)
	{
		this.databasePlatform = databasePlatform;
	}

	@Override
	public String getJdbcDriver()
	{
		return jdbcDriver;
	}

	@Override
	public void setJdbcDriver(String jdbcDriver)
	{
		this.jdbcDriver = jdbcDriver;
	}

	@Override
	public String getJdbcUrl()
	{
		return jdbcUrl;
	}

	@Override
	public void setJdbcUrl(String jdbcUrl)
	{
		this.jdbcUrl = jdbcUrl;
	}

	@Override
	public String getJdbcUsername()
	{
		return jdbcUsername;
	}

	@Override
	public void setJdbcUsername(String jdbcUsername)
	{
		this.jdbcUsername = jdbcUsername;
	}

	@Override
	public String getJdbcPassword()
	{
		return jdbcPassword;
	}

	@Override
	public void setJdbcPassword(String jdbcPassword)
	{
		this.jdbcPassword = jdbcPassword;
	}

	@Override
	public EndpointDb assemble(ResultSet resultSet) throws SQLException
	{
		if(!resultSet.isClosed())
		{
			EndpointDb endpointDb = new EndpointDb();
			endpointDb.setIdEndpointDb(resultSet.getLong("idEndpointDb"));
			endpointDb.setPersistenceUnitName(resultSet.getString("persistenceUnitName"));
			endpointDb.setDatabasePlatform(resultSet.getString("databasePlatform"));
			endpointDb.setJdbcDriver(resultSet.getString("jdbcDriver"));
			endpointDb.setJdbcUrl(resultSet.getString("jdbcUrl"));
			endpointDb.setJdbcUsername(resultSet.getString("jdbcUsername"));
			endpointDb.setJdbcPassword(resultSet.getString("jdbcPassword"));
			return endpointDb;
		}
		return null;
	}
}
