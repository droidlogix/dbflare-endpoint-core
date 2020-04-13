package com.droidlogix.dbflare.endpoint.core.models;

import java.util.List;

/**
 * @author John Pili
 * @since 1.0.0
 */

public interface IEndpointParameterBundle
{
	List<IEndpointParameter> getEndpointParameters();
	void setEndpointParameters(List<IEndpointParameter> endpointParameters);
	List<IEndpointParameter> getDeletedEndpointParameters();
	void setDeletedEndpointParameters(List<IEndpointParameter> deletedEndpointParameters);
	long[] getIds(List<IEndpointParameter> parameters);
}
