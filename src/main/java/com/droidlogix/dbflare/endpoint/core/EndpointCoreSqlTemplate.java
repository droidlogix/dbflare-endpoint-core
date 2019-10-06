package com.droidlogix.dbflare.endpoint.core;

/**
 * @author John Pili
 * @since 1.0.0
 */

public abstract class EndpointCoreSqlTemplate
{
	//region endpoint_db

	public static final String INSERT_ENDPOINT_DB = "INSERT INTO endpoint_db (persistenceUnitName, databasePlatform, jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword) "
			+ "VALUES(?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_ENDPOINT_DB = "UPDATE endpoint_db SET persistenceUnitName = ?, databasePlatform = ?, jdbcDriver = ?, jdbcUrl = ?, jdbcUsername = ?, jdbcPassword = ? WHERE idEndpointDb = ?";
	public static final String DELETE_ENDPOINT_DB = "DELETE FROM endpoint_db WHERE idEndpointDb = ?";
	public static final String GET_ENDPOINT_DB = "SELECT * FROM endpoint_db WHERE idEndpointDb = ?";
	public  static final String GET_ENDPOINT_DBS = "SELECT * FROM endpoint_db ORDER BY persistenceUnitName";

	//endregion

	//region endpoint

	public static final String INSERT_ENDPOINT = "INSERT INTO endpoint (endpointDb_idEndpointDb, api, method, description, queryString, queryType, queryResultType, queryResultBinding, mappingValue, cacheEnabled, cacheTtl, status) "
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_ENDPOINT = "UPDATE endpoint SET endpointDb_idEndpointDb = ?, api = ?, method = ?, description = ?, queryString = ?, queryType = ?, queryResultType = ?, queryResultBinding = ?, mappingValue = ?, cacheEnabled = ?, cacheTtl = ?, status = ? WHERE idEndpoint = ?";
	public static final String DELETE_ENDPOINT = "DELETE FROM endpoint WHERE idEndpoint = ?";
	public static final String GET_ENDPOINT = "SELECT * FROM endpoint WHERE idEndpoint = ?";
	public static final String GET_ENDPOINT_BY_API = "SELECT * FROM endpoint WHERE api = ?";
	public static final String GET_ENDPOINTS = "SELECT * FROM endpoint ORDER BY api";
	public static final String GET_ENDPOINTS_BY_ENDPOINTDB = "SELECT * FROM endpoint WHERE endpointDb_idEndpoint = ? ORDER BY api";
	public static final String GET_ENDPOINT_HEADERS = "SELECT endpoint.idEndpoint, endpoint.endpointDb_idEndpointDb, endpoint.api, endpoint.method, endpoint.queryType, endpoint.queryResultType FROM endpoint ORDER BY endpoint.api";
	public static final String GET_ENDPOINT_HEADERS_BY_ENDPOINTDB = "SELECT endpoint.idEndpoint, endpoint.endpointDb_idEndpointDb, endpoint.api, endpoint.method, endpoint.queryType, endpoint.queryResultType FROM endpoint WHERE endpointDb_idEndpoint = ? ORDER BY endpoint.api";

	//endregion

	//region endpoint_parameter

	public static final String INSERT_ENDPOINT_PARAMETER = "INSERT INTO endpoint_parameter (endpoint_idEndpoint, incomingParameterName, incomingParameterNameType, outgoingParameterName, outgoingParameterNameType) "
			+ "VALUES(?, ?, ?, ?, ?)";
	public static final String UPDATE_ENDPOINT_PARAMETER = "UPDATE endpoint_parameter SET endpoint_idEndpoint = ?, incomingParameterName = ?, incomingParameterNameType = ?, outgoingParameterName = ?, outgoingParameterNameType = ? WHERE idEndpointParameter = ?";
	public static final String DELETE_ENDPOINT_PARAMETER = "DELETE FROM endpoint_parameter WHERE idEndpointParameter = ?";
	public static final String GET_ENDPOINT_PARAMETER = "SELECT * FROM endpoint_parameter WHERE idEndpointParameter = ?";
	public static final String GET_ENDPOINT_PARAMETERS = "SELECT * FROM endpoint_parameter";
	public static final String GET_ENDPOINT_PARAMETERS_BY_ENDPOINT = "SELECT * FROM endpoint_parameter WHERE endpoint_idEndpoint = ?";

	//endregion

	//region endpoint_change_log

	public static final String INSERT_ENDPOINT_CHANGE_LOG = "INSERT INTO endpoint_change_log(endpoint_idEndpoint, originalPayload, modifiedPayload, differenceRemarks, entryDateTime) VALUES(?, ?, ?, ?, ?)";
	public static final String UPDATE_ENDPOINT_CHANGE_LOG = "UPDATE endpoint_change_log SET endpoint_idEndpoint = ?, originalPayload = ?, modifiedPayload = ?, differenceRemarks = ?, entryDateTime = ? WHERE idEndpointChangeLog = ?";
	public static final String DELETE_ENDPOINT_CHANGE_LOG = "DELETE FROM endpoint_change_log WHERE idEndpointChangeLog = ?";
	public static final String GET_ENDPOINT_CHANGE_LOG = "SELECT * FROM endpoint_change_log WHERE idEndpointChangeLog = ?";
	public static final String GET_ENDPOINT_CHANGE_LOG_HEADERS_BY_ENDPOINT = "SELECT idEndpointChangeLog, endpoint_idEndpoint, differenceRemarks, entryDateTime FROM endpoint_change_log WHERE endpoint_idEndpoint = ?";
	public static final String GET_ENDPOINT_CHANGE_LOGS_BY_ENDPOINT = "SELECT * FROM endpoint_change_log WHERE endpoint_idEndpoint = ?";

	//endregion
}
