package com.example.demo.container;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	
	public List<Topics> getAllTopics(){
		List<Topics> tops= new ArrayList<>();
		topicRepo.findAll().forEach(tops::add);		
		return tops;
	}	
	
	public Topics getTopicById(String id) {
		return topicRepo.findById(id).get();
	}
	
	public String saveAllTopics(Topics topic){
		topicRepo.save(topic);		
		return "updated ";		
	}
	
	public List<Topics> updateTopic(Topics topic){
		topicRepo.save(topic);
		List<Topics> tops= new ArrayList<>();
		topicRepo.findAll().forEach(tops::add);		
		return tops;
	}
	
	public String deleteTopic(String id) {
		topicRepo.deleteById(id);
		return "Deleted";
	}
}
