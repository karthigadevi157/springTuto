package com.example.demo.container;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	//GreetMessage
	@RequestMapping("/greet")
	public String greet() {
		System.out.println("Cool");
		return "Crud Oprations";
	}

	//Get All Topics
	@RequestMapping("/getTopics")
	public List<Topics> getTopics(){
		return topicService.getAllTopics();
	}
	
	//Get Topic By Id
	@RequestMapping("/getTopics/{id}")
	public Topics getTopic(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	
	//Add new Topics
	@RequestMapping(method=RequestMethod.POST , value ="/addTopics")
	public String addTopics(@RequestBody Topics topic) {
		return topicService.saveAllTopics(topic);
	}
	
	//Update Topic
	@RequestMapping(method=RequestMethod.PUT , value="/getTopics")
	public List<Topics> UpdateTopic(Topics topic){
		return topicService.updateTopic(topic);
	}
		
	//Delete Topic By Id
	@RequestMapping(method=RequestMethod.DELETE , value="/deleteTopic/{id}")
	public String deleteTopic(@PathVariable String id) {
		return topicService.deleteTopic(id);
	}
}
