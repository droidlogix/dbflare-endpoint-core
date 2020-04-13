package com.droidlogix.dbflare.endpoint.core.models;

import com.droidlogix.sqlite.datahandler.ISqliteObjectAssembler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author John Pili
 * @since 1.0.0
 */

public class EndpointChangeLog implements IEndpointChangeLog, ISqliteObjectAssembler<EndpointChangeLog>
{
	private long idEndpointChangeLog;

	private long endpoint_idEndpoint;

	private String originalPayload;

	private String moodifiedPayload;

	private String differenceRemarks;

	private Date entryDateTime;

	@Override
	public long getIdEndpointChangeLog()
	{
		return idEndpointChangeLog;
	}

	@Override
	public void setIdEndpointChangeLog(long idEndpointChangeLog)
	{
		this.idEndpointChangeLog = idEndpointChangeLog;
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
	public String getOriginalPayload()
	{
		return originalPayload;
	}

	@Override
	public void setOriginalPayload(String originalPayload)
	{
		this.originalPayload = originalPayload;
	}

	@Override
	public String getMoodifiedPayload()
	{
		return moodifiedPayload;
	}

	@Override
	public void setMoodifiedPayload(String moodifiedPayload)
	{
		this.moodifiedPayload = moodifiedPayload;
	}

	@Override
	public String getDifferenceRemarks()
	{
		return differenceRemarks;
	}

	@Override
	public void setDifferenceRemarks(String differenceRemarks)
	{
		this.differenceRemarks = differenceRemarks;
	}

	@Override
	public Date getEntryDateTime()
	{
		return entryDateTime;
	}

	@Override
	public void setEntryDateTime(Date entryDateTime)
	{
		this.entryDateTime = entryDateTime;
	}

	@Override
	public EndpointChangeLog assemble(ResultSet resultSet) throws SQLException
	{
		if (!resultSet.isClosed())
		{
			EndpointChangeLog endpointChangeLog = new EndpointChangeLog();
			endpointChangeLog.setIdEndpointChangeLog(resultSet.getLong("idEndpointChangeLog"));
			endpointChangeLog.setEndpoint_idEndpoint(resultSet.getLong("endpoint_idEndpoint"));
			endpointChangeLog.setOriginalPayload(resultSet.getString("originalPayload"));
			endpointChangeLog.setMoodifiedPayload(resultSet.getString("modifiedPayload"));
			endpointChangeLog.setDifferenceRemarks(resultSet.getString("differenceRemarks"));
			endpointChangeLog.setEntryDateTime(resultSet.getDate("entryDateTime"));
			return endpointChangeLog;
		}
		return null;
	}
}
