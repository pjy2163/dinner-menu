package com.parang.dinner_menu.controller;

import java.util.Map;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class MenuController {

    private final ChatModel chatModel;

    @GetMapping("/dinner")
    public ResponseEntity<Map<String, String>> getDinnerRecommendation() {
        try {
            String promptText = "오늘 저녁 메뉴 하나만 간단히 추천해줘. 한국어로 알려줘";
            Prompt prompt = new Prompt(promptText);
            ChatResponse response = chatModel.call(prompt);

            return ResponseEntity.ok(Map.of(
                    "status", "success",
                    "menu", response.getResult().getOutput().getText()
            ));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(Map.of(
                    "status", "error",
                    "message", e.getMessage()
            ));
        }
    }
}
