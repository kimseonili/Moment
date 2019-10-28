package com.travelmaker.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.travelmaker.dto.Chat;
@Controller
public class MessagingController {
	@MessageMapping("/greetings")
	@SendTo("/topic/greetings")
	public String greeting(Chat message) throws Exception {
		String nickname = message.getContext();
		return nickname + "님이 들어왔습니다.";
	}
	
	@MessageMapping("/chat")
	@SendTo("/topic/chat")
	public Chat outChat(Chat chat) throws Exception {
		return chat;
	}
	
	@MessageMapping("/in")
	@SendTo("/topic/in")
	public Chat inChat(Chat chat) throws Exception {
		return chat;
	}
}