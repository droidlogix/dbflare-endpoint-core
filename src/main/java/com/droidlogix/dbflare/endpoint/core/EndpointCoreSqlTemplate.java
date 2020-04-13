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
	public static final String SEARCH_ENDPOINT_HEADERS = "SELECT endpoint.idEndpoint, endpoint.endpointDb_idEndpointDb, endpoint.api, endpoint.method, endpoint.queryType, endpoint.queryResultType FROM endpoint " +
			"WHERE lower(endpoint.api) LIKE ? OR lower(endpoint.description) LIKE ? OR lower(endpoint.queryString) LIKE ? OR lower(endpoint.mappingValue) LIKE ?" +
			"ORDER BY endpoint.api";

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

	//region USER

	public static final String INSERT_USER = "INSERT INTO user (username, pwd, name, createdDateTime, modifiedDateTime, incorrectLoginAttempt, lockoutDateTime, status) "
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_USER = "UPDATE user SET username = ?, pwd = ?, name = ?, createdDateTime = ?, modifiedDateTime = ?, incorrectLoginAttempt = ?, lockoutDateTime = ?, status = ? WHERE idUser = ?";
	public static final String DELETE_USER = "DELETE FROM user WHERE idUser = ?";
	public static final String GET_USER = "SELECT * FROM user WHERE idUser = ?";
	public static final String GET_USER_BY_USERNAME = "SELECT * FROM user WHERE username = ?";
	public static final String GET_USERS = "SELECT * FROM user ORDER BY username";

	//endregion

	//region generate

	public static final String CREATE_ENDPOINT_DB = "DROP TABLE IF EXISTS endpoint_db; " +
			"CREATE TABLE endpoint_db ( " +
			"idEndpointDb integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
			"persistenceUnitName TEXT, " +
			"databasePlatform TEXT, " +
			"jdbcDriver TEXT, " +
			"jdbcUrl TEXT, " +
			"jdbcUsername  TEXT, " +
			"jdbcPassword TEXT); " +
			"BEGIN; " +
			"INSERT INTO endpoint_db VALUES (1, 'persistentUnit1', 'org.eclipse.persistence.platform.database.MySQLPlatform', 'com.mysql.jdbc.Driver', 'jdbc:mysql://localhost:3306/db?autoReconnect=true&useUnicode=yes', 'username', 'password'); " +
			"COMMIT; ";

	public static final String CREATE_ENDPOINT = "DROP TABLE IF EXISTS endpoint; " +
			"CREATE TABLE endpoint ( " +
			"idEndpoint integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
			"endpointDb_idEndpointDb integer, " +
			"api TEXT, " +
			"method TEXT, " +
			"description TEXT, " +
			"queryString TEXT, " +
			"queryType TEXT, " +
			"queryResultType TEXT, " +
			"queryResultBinding TEXT, " +
			"mappingValue TEXT, " +
			"cacheEnabled integer, " +
			"cacheTtl integer, " +
			"status TEXT, " +
			"CONSTRAINT fk_endpoint_db_endpoint FOREIGN KEY (endpointDb_idEndpointDb) REFERENCES endpoint_db (idEndpointDb) ON DELETE CASCADE ON UPDATE CASCADE); ";

	public static final String CREATE_ENDPOINT_CHANGE_LOG = "DROP TABLE IF EXISTS endpoint_change_log; " +
			"CREATE TABLE endpoint_change_log ( " +
			"idEndpointChangeLog integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
			"endpoint_idEndpoint integer, " +
			"originalPayload TEXT, " +
			"modifiedPayload TEXT, " +
			"differenceRemarks TEXT, " +
			"entryDateTime integer, " +
			"CONSTRAINT fk_endpoint_endpoint_change_log FOREIGN KEY (endpoint_idEndpoint) REFERENCES endpoint (idEndpoint) ON DELETE CASCADE ON UPDATE NO ACTION); ";

	public static final String CREATE_ENDPOINT_PARAMETER = "DROP TABLE IF EXISTS endpoint_parameter; " +
			"CREATE TABLE endpoint_parameter ( " +
			"idEndpointParameter integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
			"endpoint_idEndpoint integer, " +
			"incomingParameterName TEXT, " +
			"incomingParameterNameType TEXT, " +
			"outgoingParameterName TEXT, " +
			"outgoingParameterNameType TEXT, " +
			"nullableValue integer, " +
			"preprocessor TEXT, " +
			"CONSTRAINT fk_endpoint_endpoint_parameter FOREIGN KEY (endpoint_idEndpoint) REFERENCES endpoint (idEndpoint) ON DELETE CASCADE ON UPDATE NO ACTION); ";

	public static final String CREATE_USER = "DROP TABLE IF EXISTS user; " +
			"CREATE TABLE user ( " +
			"idUser integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
			"username TEXT NOT NULL, " +
			"pwd TEXT NOT NULL, " +
			"name TEXT NOT NULL, " +
			"createdDateTime integer NOT NULL, " +
			"modifiedDateTime integer NOT NULL, " +
			"incorrectLoginAttempt integer DEFAULT 0, " +
			"lockoutDateTime integer, " +
			"status TEXT); ";

	public static final String CREATE_PAYLOAD_PARSER_RULE = "DROP TABLE IF EXISTS payload_parser_rule; " +
			"CREATE TABLE payload_parser_rule ( " +
			"idPayloadParserRule integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
			"code TEXT NOT NULL, " +
			"description TEXT, " +
			"parsingRule TEXT NOT NULL, " +
			"createdDateTime integer NOT NULL, " +
			"modifiedDateTime integer NOT NULL, " +
			"status TEXT); ";

	public static final String CREATE_INDEXES = "" +
			"CREATE INDEX main.idx_endpoint_db_idEndpointDb " +
			"ON endpoint (endpointDb_idEndpointDb ASC); " +
			"" +
			"CREATE UNIQUE INDEX main.unique_api " +
			"ON endpoint (api ASC); " +
			"" +
			"CREATE INDEX main.idx_endpoint_idEndpoint2 " +
			"ON endpoint_change_log (endpoint_idEndpoint ASC); " +
			"" +
			"CREATE INDEX main.idx_endpoint_idEndpoint1 " +
			"ON endpoint_parameter (endpoint_idEndpoint ASC); " +
			"" +
			"CREATE UNIQUE INDEX main.unique_username " +
			"ON user (username ASC);" +
			"" +
			"CREATE UNIQUE INDEX main.unique_payload_parser_rule_code " +
			"ON payload_parser_rule (code ASC);";

	//endregion
}
