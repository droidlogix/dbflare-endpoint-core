package com.droidlogix.dbflare.endpoint.core.models;

import com.droidlogix.sqlite.datahandler.ISqliteObjectAssembler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author John Pili
 * @since 1.0.0
 */

public class EndpointParameter implements IEndpointParameter, ISqliteObjectAssembler<EndpointParameter>
{
	private long idEndpointParameter;

	private long endpoint_idEndpoint;

	private String incomingParameterName;

	private String incomingParameterNameType;

	private String outgoingParameterName;

	private String outgoingParameterNameType;

	private boolean nullableValue;

	private String preprocessor;

	@Override
	public long getIdEndpointParameter()
	{
		return idEndpointParameter;
	}

	@Override
	public void setIdEndpointParameter(long idEndpointParameter)
	{
		this.idEndpointParameter = idEndpointParameter;
	}

	@Override
	public long getEndpoint_idEndpoint()
	{
		return endpoint_idEndpoint;
	}

	@Override
	public void setEndpoint_idEndpoint(long endpoint_idEndpoint)
	{
		this.endpoint_idEndpoint = endpoint_idEndpoint;
	}

	@Override
	public String getIncomingParameterName()
	{
		return incomingParameterName;
	}

	@Override
	public void setIncomingParameterName(String incomingParameterName)
	{
		this.incomingParameterName = incomingParameterName;
	}

	@Override
	public String getIncomingParameterNameType()
	{
		return incomingParameterNameType;
	}

	@Override
	public void setIncomingParameterNameType(String incomingParameterNameType)
	{
		this.incomingParameterNameType = incomingParameterNameType;
	}

	@Override
	public String getOutgoingParameterName()
	{
		return outgoingParameterName;
	}

	@Override
	public void setOutgoingParameterName(String outgoingParameterName)
	{
		this.outgoingParameterName = outgoingParameterName;
	}

	@Override
	public String getOutgoingParameterNameType()
	{
		return outgoingParameterNameType;
	}

	@Override
	public void setOutgoingParameterNameType(String outgoingParameterNameType)
	{
		this.outgoingParameterNameType = outgoingParameterNameType;
	}

	@Override
	public boolean isNullableValue()
	{
		return nullableValue;
	}

	@Override
	public void setNullableValue(boolean nullableValue)
	{
		this.nullableValue = nullableValue;
	}

	@Override
	public String getPreprocessor()
	{
		return preprocessor;
	}

	@Override
	public void setPreprocessor(String preprocessor)
	{
		this.preprocessor = preprocessor;
	}

	@Override
	public EndpointParameter assemble(ResultSet resultSet) throws SQLException
	{
		if(!resultSet.isClosed())
		{
			EndpointParameter endpointParameter = new EndpointParameter();
			endpointParameter.setIdEndpointParameter(resultSet.getLong("idEndpointParameter"));
			endpointParameter.setEndpoint_idEndpoint(resultSet.getLong("endpoint_idEndpoint"));
			endpointParameter.setIncomingParameterName(resultSet.getString("incomingParameterName"));
			endpointParameter.setIncomingParameterNameType(resultSet.getString("incomingParameterNameType"));
			endpointParameter.setOutgoingParameterName(resultSet.getString("outgoingParameterName"));
			endpointParameter.setOutgoingParameterNameType(resultSet.getString("outgoingParameterNameType"));
			endpointParameter.setNullableValue(resultSet.getBoolean("nullableValue"));
			endpointParameter.setPreprocessor(resultSet.getString("preprocessor"));
			return endpointParameter;
		}
		return null;
	}
}
