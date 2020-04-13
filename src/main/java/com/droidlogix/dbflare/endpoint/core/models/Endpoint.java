package com.droidlogix.dbflare.endpoint.core.models;

import com.droidlogix.sqlite.datahandler.ISqliteObjectAssembler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author John Pili
 * @since 1.0.0
 */

public class Endpoint implements IEndpoint, ISqliteObjectAssembler<Endpoint>
{
	private long idEndpoint;
	private long endpointDb_idEndpointDb;
	private String api;
	private String method;
	private String description;
	private String queryString;
	private String queryType;
	private String queryResultType;
	private String queryResultBinding;
	private String mappingValue;
	private boolean cacheEnabled;
	private long cacheTtl;
	private String status;

	@Override
	public long getIdEndpoint()
	{
		return this.idEndpoint;
	}

	@Override
	public void setIdEndpoint(long idEndpoint)
	{
		this.idEndpoint = idEndpoint;
	}

	@Override
	public long getEndpointDb_idEndpointDb()
	{
		return this.endpointDb_idEndpointDb;
	}

	@Override
	public void setEndpointDb_idEndpointDb(long endpointDb_idEndpointDb)
	{
		this.endpointDb_idEndpointDb = endpointDb_idEndpointDb;
	}

	@Override
	public String getApi()
	{
		return this.api;
	}

	@Override
	public void setApi(String api)
	{
		this.api = api;
	}

	@Override
	public String getMethod()
	{
		return this.method;
	}

	@Override
	public void setMethod(String method)
	{
		this.method = method;
	}

	@Override
	public String getDescription()
	{
		return this.description;
	}

	@Override
	public void setDescription(String description)
	{
		this.description = description;
	}

	@Override
	public String getQueryString()
	{
		return this.queryString;
	}

	@Override
	public void setQueryString(String queryString)
	{
		this.queryString = queryString;
	}

	@Override
	public String getQueryType()
	{
		return this.queryType;
	}

	@Override
	public void setQueryType(String queryType)
	{
		this.queryType = queryType;
	}

	@Override
	public String getQueryResultType()
	{
		return this.queryResultType;
	}

	@Override
	public void setQueryResultType(String queryResultType)
	{
		this.queryResultType = queryResultType;
	}

	@Override
	public String getQueryResultBinding()
	{
		return this.queryResultBinding;
	}

	@Override
	public void setQueryResultBinding(String queryResultBinding)
	{
		this.queryResultBinding = queryResultBinding;
	}

	@Override
	public String getMappingValue()
	{
		return this.mappingValue;
	}

	@Override
	public void setMappingValue(String mappingValue)
	{
		this.mappingValue = mappingValue;
	}

	@Override
	public boolean isCacheEnabled()
	{
		return this.cacheEnabled;
	}

	@Override
	public void setCacheEnabled(boolean cacheEnabled)
	{
		this.cacheEnabled = cacheEnabled;
	}

	@Override
	public long getCacheTtl()
	{
		return this.cacheTtl;
	}

	@Override
	public void setCacheTtl(long ms)
	{
		this.cacheTtl = ms;
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
	public Endpoint assemble(ResultSet resultSet) throws SQLException
	{
		if(!resultSet.isClosed())
		{
			Endpoint endpoint = new Endpoint();
			endpoint.setIdEndpoint(resultSet.getLong("idEndpoint"));
			endpoint.setEndpointDb_idEndpointDb(resultSet.getLong("endpointDb_idEndpointDb"));
			endpoint.setApi(resultSet.getString("api"));
			endpoint.setMethod(resultSet.getString("method"));
			endpoint.setDescription(resultSet.getString("description"));
			endpoint.setQueryString(resultSet.getString("queryString"));
			endpoint.setQueryType(resultSet.getString("queryType"));
			endpoint.setQueryResultType(resultSet.getString("queryResultType"));
			endpoint.setQueryResultBinding(resultSet.getString("queryResultBinding"));
			endpoint.setMappingValue(resultSet.getString("mappingValue"));
			endpoint.setCacheEnabled(resultSet.getBoolean("cacheEnabled"));
			endpoint.setCacheTtl(resultSet.getLong("cacheTtl"));
			endpoint.setStatus(resultSet.getString("status"));
			return endpoint;
		}
		return null;
	}
}
