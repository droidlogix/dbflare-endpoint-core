package com.droidlogix.dbflare.endpoint.core.models;

/**
 * @author John Pili
 * @since 1.0.0
 */

public interface IEndpoint
{
	long getIdEndpoint();

	void setIdEndpoint(long idEndpoint);

	long getEndpointDb_idEndpointDb();

	void setEndpointDb_idEndpointDb(long endpointDb_idEndpointDb);

	String getApi();

	void setApi(String api);

	String getMethod();

	void setMethod(String method);

	String getDescription();

	void setDescription(String description);

	String getQueryString();

	void setQueryString(String queryString);

	String getQueryType();

	void setQueryType(String queryType);

	String getQueryResultType();

	void setQueryResultType(String queryResultType);

	String getQueryResultBinding();

	void setQueryResultBinding(String queryResultBinding);

	String getMappingValue();

	void setMappingValue(String mappingValue);

	boolean isCacheEnabled();

	void setCacheEnabled(boolean cacheEnabled);

	long getCacheTtl();

	void setCacheTtl(long ms);

	String getStatus();

	void setStatus(String status);
}
