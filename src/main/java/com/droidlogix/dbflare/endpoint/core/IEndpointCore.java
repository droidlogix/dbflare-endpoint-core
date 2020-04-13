package com.droidlogix.dbflare.endpoint.core;

import com.droidlogix.dbflare.endpoint.core.models.*;
import com.droidlogix.sqlite.datahandler.exceptions.SqliteDriverNotFoundException;

import java.sql.SQLException;
import java.util.List;

/**
 * @author John Pili
 * @since 1.0.0
 */

public interface IEndpointCore
{
	//region ENDPOINT_DB

	/**
	 * Create an entry for endpoint_db for database connection
	 * @param endpointDb
	 * @return
	 * @throws SQLException
	 * @throws SqliteDriverNotFoundException
	 */
	IEndpointDb createEndpointDb(IEndpointDb endpointDb) throws SQLException, SqliteDriverNotFoundException;

	/**
	 * Update an endpoint_db entry
	 * @param endpointDb
	 * @throws SQLException
	 * @throws SqliteDriverNotFoundException
	 */
	void updateEndpointDb(IEndpointDb endpointDb) throws SQLException, SqliteDriverNotFoundException;

	/**
	 * Delete an endpoint_db entry
	 * @param id
	 * @throws SQLException
	 * @throws SqliteDriverNotFoundException
	 */
	void deleteEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException;

	/**
	 * Get an endpoint_db entry based on ID
	 * @param id
	 * @return
	 * @throws SQLException
	 * @throws SqliteDriverNotFoundException
	 */
	IEndpointDb getEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException;

	List<IEndpointDb> getEndpointDbs() throws SQLException, SqliteDriverNotFoundException;

	//endregion

	//region ENDPOINT

	IEndpoint createEndpoint(IEndpoint endpoint) throws SQLException, SqliteDriverNotFoundException;

	void updateEndpoint(IEndpoint endpoint) throws SQLException, SqliteDriverNotFoundException;

	void deleteEndpoint(long id) throws SQLException, SqliteDriverNotFoundException;

	IEndpoint getEndpoint(long id) throws SQLException, SqliteDriverNotFoundException;

	IEndpoint getEndpointByApi(String api) throws SQLException, SqliteDriverNotFoundException;

	List<IEndpoint> getEndpoints() throws SQLException, SqliteDriverNotFoundException;

	List<IEndpoint> getEndpointsByEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException;

	List<IEndpointHeaderInfo> getEndpointHeaders() throws SQLException, SqliteDriverNotFoundException;

	List<IEndpointHeaderInfo> getEndpointHeadersByEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException;

	List<IEndpointHeaderInfo> searchEndpointHeaders(String keyword) throws SQLException, SqliteDriverNotFoundException;

	//endregion

	//region ENDPOINT_PARAMETERS

	IEndpointParameter createEndpointParameter(IEndpointParameter endpointParameter) throws SQLException, SqliteDriverNotFoundException;

	void updateEndpointParameter(IEndpointParameter endpointParameter) throws SQLException, SqliteDriverNotFoundException;

	void deleteEndpointParameter(long id) throws SQLException, SqliteDriverNotFoundException;

	void deleteEndpointParameters(long idEndpoint, long[] ids) throws SQLException, SqliteDriverNotFoundException;

	IEndpointParameter getEndpointParameter(long id) throws SQLException, SqliteDriverNotFoundException;

	List<IEndpointParameter> getEndpointParameters() throws SQLException, SqliteDriverNotFoundException;

	List<IEndpointParameter> getEndpointParametersByEndpoint(long id) throws SQLException, SqliteDriverNotFoundException;

	void processEndpointParameter(long idEndpoint, EndpointParameterBundle endpointParameterBundle) throws SQLException, SqliteDriverNotFoundException;

	//endregion

	//region PAYLOAD PARSER RULE

	//endregion

	//region USER

	IUser createUser(IUser user) throws SQLException, SqliteDriverNotFoundException;

	void updateUser(IUser user) throws SQLException, SqliteDriverNotFoundException;

	void deleteUser(long id) throws SQLException, SqliteDriverNotFoundException;

	IUser getUser(long id) throws SQLException, SqliteDriverNotFoundException;

	IUser getUser(String username) throws SQLException, SqliteDriverNotFoundException;

	List<IUser> getUsers() throws SQLException, SqliteDriverNotFoundException;

	//endregion
}
