package com.droidlogix.dbflare.endpoint.core.models;

/**
 * @author John Pili
 * @since 1.0.0
 */

public interface IEndpointParameter
{
	long getIdEndpointParameter();

	void setIdEndpointParameter(long idEndpointParameter);

	long getEndpoint_idEndpoint();

	void setEndpoint_idEndpoint(long endpoint_idEndpoint);

	String getIncomingParameterName();

	void setIncomingParameterName(String incomingParameterName);

	String getIncomingParameterNameType();

	void setIncomingParameterNameType(String incomingParameterNameType);

	String getOutgoingParameterName();

	void setOutgoingParameterName(String outgoingParameterName);

	String getOutgoingParameterNameType();

	void setOutgoingParameterNameType(String outgoingParameterNameType);

	boolean isNullableValue();

	void setNullableValue(boolean nullableValue);

	String getPreprocessor();

	void setPreprocessor(String preprocessor);
}
