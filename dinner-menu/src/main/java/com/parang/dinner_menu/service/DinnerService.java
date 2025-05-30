package com.parang.dinner_menu.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

import com.parang.dinner_menu.prompt.PromptProvider;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DinnerService {

    private final ChatModel chatModel;
    private final PromptProvider promptProvider;

    public String recommendDinner(String styles) {
        Prompt prompt = promptProvider.getDinnerPrompt(styles);
        ChatResponse response = chatModel.call(prompt);
        return response.getResult().getOutput().getText();
    }
}
