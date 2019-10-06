package com.droidlogix.dbflare.endpoint.core;

import com.dbflare.core.models.*;
import com.droidlogix.dbflare.endpoint.core.models.EndpointParameterBundle;
import com.droidlogix.sqlite.datahandler.SqliteRepository;
import com.droidlogix.sqlite.datahandler.exceptions.SqliteDriverNotFoundException;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author John Pili
 * @since 1.0.0
 */

public class EndpointCore implements IEndpointCore
{
	private SqliteRepository sqliteRepository;

	public EndpointCore(SqliteRepository sqliteRepository)
	{
		this.sqliteRepository = sqliteRepository;
	}

	@Override
	public IEndpointDb createEndpointDb(IEndpointDb endpointDb) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, endpointDb.getPersistenceUnitName());
		parameters.put(2, endpointDb.getDatabasePlatform());
		parameters.put(3, endpointDb.getJdbcDriver());
		parameters.put(4, endpointDb.getJdbcUrl());
		parameters.put(5, endpointDb.getJdbcUsername());
		parameters.put(6, endpointDb.getJdbcPassword());
		endpointDb.setIdEndpointDb(this.sqliteRepository.insert(EndpointCoreSqlTemplate.INSERT_ENDPOINT_DB, parameters));
		return endpointDb;
	}

	@Override
	public void updateEndpointDb(IEndpointDb endpointDb) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, endpointDb.getPersistenceUnitName());
		parameters.put(2, endpointDb.getDatabasePlatform());
		parameters.put(3, endpointDb.getJdbcDriver());
		parameters.put(4, endpointDb.getJdbcUrl());
		parameters.put(5, endpointDb.getJdbcUsername());
		parameters.put(6, endpointDb.getJdbcPassword());
		parameters.put(7, endpointDb.getIdEndpointDb());
		this.sqliteRepository.update(EndpointCoreSqlTemplate.UPDATE_ENDPOINT_DB, parameters);
	}

	@Override
	public void deleteEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		this.sqliteRepository.delete(EndpointCoreSqlTemplate.DELETE_ENDPOINT_DB, parameters);
	}

	@Override
	public IEndpointDb getEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		return this.sqliteRepository.getSingle(EndpointCoreSqlTemplate.GET_ENDPOINT_DB, parameters, new EndpointDb());
	}

	@Override
	public List<IEndpointDb> getEndpointDbs() throws SQLException, SqliteDriverNotFoundException
	{
		return this.sqliteRepository.getList(EndpointCoreSqlTemplate.GET_ENDPOINT_DBS, new EndpointDb());
	}

	@Override
	public IEndpoint createEndpoint(IEndpoint endpoint) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, endpoint.getEndpointDb_idEndpointDb());
		parameters.put(2, endpoint.getApi());
		parameters.put(3, endpoint.getMethod());
		parameters.put(4, endpoint.getDescription());
		parameters.put(5, endpoint.getQueryString());
		parameters.put(6, endpoint.getQueryType());
		parameters.put(7, endpoint.getQueryResultType());
		parameters.put(8, endpoint.getQueryResultBinding());
		parameters.put(9, endpoint.getMappingValue());
		parameters.put(10, endpoint.isCacheEnabled());
		parameters.put(11, endpoint.getCacheTtl());
		parameters.put(12, endpoint.getStatus());
		endpoint.setIdEndpoint(this.sqliteRepository.insert(EndpointCoreSqlTemplate.INSERT_ENDPOINT, parameters));
		return endpoint;
	}

	@Override
	public void updateEndpoint(IEndpoint endpoint) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, endpoint.getEndpointDb_idEndpointDb());
		parameters.put(2, endpoint.getApi());
		parameters.put(3, endpoint.getMethod());
		parameters.put(4, endpoint.getDescription());
		parameters.put(5, endpoint.getQueryString());
		parameters.put(6, endpoint.getQueryType());
		parameters.put(7, endpoint.getQueryResultType());
		parameters.put(8, endpoint.getQueryResultBinding());
		parameters.put(9, endpoint.getMappingValue());
		parameters.put(10, endpoint.isCacheEnabled());
		parameters.put(11, endpoint.getCacheTtl());
		parameters.put(12, endpoint.getStatus());
		parameters.put(13, endpoint.getIdEndpoint());
		this.sqliteRepository.update(EndpointCoreSqlTemplate.UPDATE_ENDPOINT, parameters);
	}

	@Override
	public void deleteEndpoint(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		this.sqliteRepository.delete(EndpointCoreSqlTemplate.DELETE_ENDPOINT, parameters);
	}

	@Override
	public IEndpoint getEndpoint(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		return this.sqliteRepository.getSingle(EndpointCoreSqlTemplate.GET_ENDPOINT, parameters, new Endpoint());
	}

	@Override
	public IEndpoint getEndpointByApi(String api) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, api);
		return this.sqliteRepository.getSingle(EndpointCoreSqlTemplate.GET_ENDPOINT_BY_API, parameters, new Endpoint());
	}

	@Override
	public List<IEndpoint> getEndpoints() throws SQLException, SqliteDriverNotFoundException
	{
		return this.sqliteRepository.getList(EndpointCoreSqlTemplate.GET_ENDPOINTS, new Endpoint());
	}

	@Override
	public List<IEndpoint> getEndpointsByEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		return this.sqliteRepository.getList(EndpointCoreSqlTemplate.GET_ENDPOINTS_BY_ENDPOINTDB, parameters, new Endpoint());
	}

	@Override
	public List<IEndpointHeaderInfo> getEndpointHeaders() throws SQLException, SqliteDriverNotFoundException
	{
		return this.sqliteRepository.getList(EndpointCoreSqlTemplate.GET_ENDPOINT_HEADERS, new EndpointHeaderInfo());
	}

	@Override
	public List<IEndpointHeaderInfo> getEndpointHeadersByEndpointDb(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		return this.sqliteRepository.getList(EndpointCoreSqlTemplate.GET_ENDPOINTS_BY_ENDPOINTDB, parameters, new Endpoint());
	}

	@Override
	public IEndpointParameter createEndpointParameter(IEndpointParameter endpointParameter) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, endpointParameter.getEndpoint_idEndpoint());
		parameters.put(2, endpointParameter.getIncomingParameterName());
		parameters.put(3, endpointParameter.getIncomingParameterNameType());
		parameters.put(4, endpointParameter.getOutgoingParameterName());
		parameters.put(5, endpointParameter.getOutgoingParameterNameType());
		endpointParameter.setIdEndpointParameter(this.sqliteRepository.insert(EndpointCoreSqlTemplate.INSERT_ENDPOINT_PARAMETER, parameters));
		return endpointParameter;
	}

	@Override
	public void updateEndpointParameter(IEndpointParameter endpointParameter) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, endpointParameter.getEndpoint_idEndpoint());
		parameters.put(2, endpointParameter.getIncomingParameterName());
		parameters.put(3, endpointParameter.getIncomingParameterNameType());
		parameters.put(4, endpointParameter.getOutgoingParameterName());
		parameters.put(5, endpointParameter.getOutgoingParameterNameType());
		parameters.put(6, endpointParameter.getIdEndpointParameter());
		this.sqliteRepository.update(EndpointCoreSqlTemplate.UPDATE_ENDPOINT_PARAMETER, parameters);
	}

	@Override
	public void deleteEndpointParameter(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		this.sqliteRepository.delete(EndpointCoreSqlTemplate.DELETE_ENDPOINT_PARAMETER, parameters);
	}

	@Override
	public void deleteEndpointParameters(long idEndpoint, long[] ids) throws SQLException, SqliteDriverNotFoundException
	{
		if(ids != null && ids.length > 0)
		{
			for (long id : ids)
			{
				if(id != 0)
				{
					IEndpointParameter endpointParameter = this.getEndpointParameter(id);
					if (endpointParameter.getEndpoint_idEndpoint() == idEndpoint && endpointParameter.getIdEndpointParameter() != 0)
					{
						this.deleteEndpointParameter(endpointParameter.getIdEndpointParameter());
					}
				}
			}
		}
	}

	@Override
	public IEndpointParameter getEndpointParameter(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		return this.sqliteRepository.getSingle(EndpointCoreSqlTemplate.GET_ENDPOINT_PARAMETER, parameters, new EndpointParameter());
	}

	@Override
	public List<IEndpointParameter> getEndpointParameters() throws SQLException, SqliteDriverNotFoundException
	{
		return this.sqliteRepository.getList(EndpointCoreSqlTemplate.GET_ENDPOINT_PARAMETERS, new EndpointParameter());
	}

	@Override
	public List<IEndpointParameter> getEndpointParametersByEndpoint(long id) throws SQLException, SqliteDriverNotFoundException
	{
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, id);
		return this.sqliteRepository.getList(EndpointCoreSqlTemplate.GET_ENDPOINT_PARAMETERS_BY_ENDPOINT, parameters, new EndpointParameter());
	}

	@Override
	public void processEndpointParameter(long idEndpoint, EndpointParameterBundle endpointParameterBundle) throws SQLException, SqliteDriverNotFoundException
	{
		this.deleteEndpointParameters(idEndpoint, endpointParameterBundle.getIds(endpointParameterBundle.getDeletedEndpointParameters())); // DELETE ENDPOINT PARAMETERS
		if (endpointParameterBundle.getEndpointParameters() != null && !endpointParameterBundle.getEndpointParameters().isEmpty())
		{
			for (IEndpointParameter item : endpointParameterBundle.getEndpointParameters())
			{
				if (item.getIdEndpointParameter() == 0) // New record
				{
					if(!item.getIncomingParameterName().trim().isEmpty() && !item.getOutgoingParameterName().trim().isEmpty())
					{
						EndpointParameter endpointParameter = new EndpointParameter();
						endpointParameter.setEndpoint_idEndpoint(idEndpoint);
						endpointParameter.setIncomingParameterName(item.getIncomingParameterName());
						endpointParameter.setIncomingParameterNameType(item.getIncomingParameterNameType());
						endpointParameter.setOutgoingParameterName(item.getOutgoingParameterName());
						endpointParameter.setOutgoingParameterNameType(item.getOutgoingParameterNameType());
						createEndpointParameter(endpointParameter);
					}
				}
				else // Update record
				{
					IEndpointParameter endpointParameter = getEndpointParameter(item.getIdEndpointParameter());
					if (endpointParameter != null)
					{
						if(!item.getIncomingParameterName().trim().isEmpty() && !item.getOutgoingParameterName().trim().isEmpty())
						{
							endpointParameter.setIncomingParameterName(item.getIncomingParameterName());
							endpointParameter.setIncomingParameterNameType(item.getIncomingParameterNameType());
							endpointParameter.setOutgoingParameterName(item.getOutgoingParameterName());
							endpointParameter.setOutgoingParameterNameType(item.getOutgoingParameterNameType());
							this.updateEndpointParameter(endpointParameter);
						}
					}
				}
			}
		}
	}
}
