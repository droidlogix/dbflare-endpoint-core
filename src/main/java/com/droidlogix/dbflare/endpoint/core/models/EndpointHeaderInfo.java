package com.droidlogix.dbflare.endpoint.core.models;

import com.droidlogix.sqlite.datahandler.ISqliteObjectAssembler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author John Pili
 * @since 1.0.0
 */

public class EndpointHeaderInfo implements IEndpointHeaderInfo, ISqliteObjectAssembler<EndpointHeaderInfo>
{
	private long idEndpoint;
	private long endpointDb_idEndpointDb;
	private String api;
	private String method;
	private String queryType;
	private String queryResultType;

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
	public EndpointHeaderInfo assemble(ResultSet resultSet) throws SQLException
	{
		if (!resultSet.isClosed())
		{
			EndpointHeaderInfo endpoint = new EndpointHeaderInfo();
			endpoint.setIdEndpoint(resultSet.getLong("idEndpoint"));
			endpoint.setEndpointDb_idEndpointDb(resultSet.getLong("endpointDb_idEndpointDb"));
			endpoint.setApi(resultSet.getString("api"));
			endpoint.setMethod(resultSet.getString("method"));
			endpoint.setQueryType(resultSet.getString("queryType"));
			endpoint.setQueryResultType(resultSet.getString("queryResultType"));
			return endpoint;
		}
		return null;
	}
}
