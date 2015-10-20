package net.gisnas.jira.rest;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.mail.queue.MailQueue;
import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/status")
public class MailQueueStatus {

	@GET
	@AnonymousAllowed
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getMessage() {
		MailQueue mailQueue = ComponentAccessor.getMailQueue();
		return Response.ok(new MailQueueStatusModel(mailQueue)).build();
	}
}