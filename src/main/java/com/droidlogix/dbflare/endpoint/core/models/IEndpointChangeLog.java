package com.droidlogix.dbflare.endpoint.core.models;

import java.util.Date;

/**
 * @author John Pili
 * @since 1.0.0
 */

public interface IEndpointChangeLog
{
	long getIdEndpointChangeLog();

	void setIdEndpointChangeLog(long idEndpointChangeLog);

	long getEndpoint_idEndpoint();

	void setEndpoint_idEndpoint(long endpoint_idEndpoint);

	String getOriginalPayload();

	void setOriginalPayload(String originalPayload);

	String getMoodifiedPayload();

	void setMoodifiedPayload(String moodifiedPayload);

	String getDifferenceRemarks();

	void setDifferenceRemarks(String differenceRemarks);

	Date getEntryDateTime();

	void setEntryDateTime(Date entryDateTime);
}
