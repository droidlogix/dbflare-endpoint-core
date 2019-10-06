package com.droidlogix.dbflare.endpoint.core;

public abstract class EndpointCoreBuildSqlTemplate
{
	public static final String INSERT_ENDPOINT_DB = "INSERT INTO endpoint_db (persistenceUnitName, databasePlatform, jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword) "
			+ "VALUES(?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_ENDPOINT_DB = "UPDATE endpoint_db SET persistenceUnitName = ?, databasePlatform = ?, jdbcDriver = ?, jdbcUrl = ?, jdbcUsername = ?, jdbcPassword = ? WHERE idEndpointDb = ?";
	public static final String DELETE_ENDPOINT_DB = "DELETE FROM endpoint_db WHERE idEndpointDb = ?";
	public static final String GET_ENDPOINT_DB = "SELECT * FROM endpoint_db WHERE idEndpointDb = ?";
	public  static final String GET_ENDPOINT_DBS = "SELECT * FROM endpoint_db ORDER BY persistenceUnitName";
}
