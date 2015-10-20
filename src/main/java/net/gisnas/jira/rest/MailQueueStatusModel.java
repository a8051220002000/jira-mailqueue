package net.gisnas.jira.rest;

import javax.xml.bind.annotation.*;

import com.atlassian.mail.queue.MailQueue;
@XmlRootElement(name = "mailQueue")
@XmlAccessorType(XmlAccessType.FIELD)
public class MailQueueStatusModel {

    int size;
	int errorSize;

    public MailQueueStatusModel() {
    }

    public MailQueueStatusModel(MailQueue mailQueue) {
        size = mailQueue.size();
        errorSize = mailQueue.errorSize();
    }

}