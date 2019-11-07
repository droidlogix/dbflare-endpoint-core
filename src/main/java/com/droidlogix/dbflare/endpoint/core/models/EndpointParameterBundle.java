package com.droidlogix.dbflare.endpoint.core.models;

import com.dbflare.core.models.EndpointParameter;
import com.dbflare.core.models.IEndpoint;
import com.dbflare.core.models.IEndpointParameter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Pili
 * @since 1.0.0
 */

public class EndpointParameterBundle implements IEndpointParameterBundle
{
	private List<IEndpointParameter> endpointParameters = new ArrayList<>();
	private List<IEndpointParameter> deletedEndpointParameters = new ArrayList<>();

	@Override
	public List<IEndpointParameter> getEndpointParameters()
	{
		return this.endpointParameters;
	}

	@Override
	public void setEndpointParameters(List<IEndpointParameter> endpointParameters)
	{
		this.endpointParameters = endpointParameters;
	}

	@Override
	public List<IEndpointParameter> getDeletedEndpointParameters()
	{
		return this.deletedEndpointParameters;
	}

	@Override
	public void setDeletedEndpointParameters(List<IEndpointParameter> deletedEndpointParameters)
	{
		this.deletedEndpointParameters = deletedEndpointParameters;
	}

	@Override
	public long[] getIds(List<IEndpointParameter> parameters)
	{
		if(parameters != null && !parameters.isEmpty())
		{
			long[] ids = new long[parameters.size()];
			int i = 0;
			for(IEndpointParameter item : parameters)
			{
				ids[i] = item.getIdEndpointParameter();
				++i;
			}
			return ids;
		}
		return new long[0];
	}
}
