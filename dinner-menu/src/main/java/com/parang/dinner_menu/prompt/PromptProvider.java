package com.parang.dinner_menu.prompt;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Component;

@Component
public class PromptProvider {
    public Prompt getDinnerPrompt(String styles) {
        return new Prompt("오늘 저녁 메뉴 하나만" + styles + " 중에서 골라서 간단하게 추천해줘. 한국어로 알려줘");
    }
}
