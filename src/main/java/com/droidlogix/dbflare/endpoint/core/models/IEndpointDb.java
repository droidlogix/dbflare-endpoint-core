package com.droidlogix.dbflare.endpoint.core.models;

/**
 * @author John Pili
 * @since 1.0.0
 */

public interface IEndpointDb
{
	long getIdEndpointDb();

	void setIdEndpointDb(long idEndpointDb);

	String getPersistenceUnitName();

	void setPersistenceUnitName(String persistenceUnitName);

	String getDatabasePlatform();

	void setDatabasePlatform(String databasePlatform);

	String getJdbcDriver();

	void setJdbcDriver(String jdbcDriver);

	String getJdbcUrl();

	void setJdbcUrl(String jdbcUrl);

	String getJdbcUsername();

	void setJdbcUsername(String jdbcUsername);

	String getJdbcPassword();

	void setJdbcPassword(String jdbcPassword);
}
