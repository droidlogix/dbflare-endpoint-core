package com.droidlogix.dbflare.endpoint.core.models;

/**
 * @author John Pili
 * @since 1.0.0
 */

public interface IEndpointHeaderInfo
{
	long getIdEndpoint();
	void setIdEndpoint(long idEndpoint);
	long getEndpointDb_idEndpointDb();
	void setEndpointDb_idEndpointDb(long endpointDb_idEndpointDb);
	String getApi();
	void setApi(String api);
	String getMethod();
	void setMethod(String method);
	String getQueryType();
	void setQueryType(String queryType);
	String getQueryResultType();
	void setQueryResultType(String queryResultType);
}
