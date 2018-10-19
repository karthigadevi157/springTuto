package com.example.demo.container;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {
	@Id
	private String tId;
	private String topic,topicDescription;

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
}
