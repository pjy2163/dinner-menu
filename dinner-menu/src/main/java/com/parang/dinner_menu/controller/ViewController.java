package com.parang.dinner_menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parang.dinner_menu.service.DinnerService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ViewController {
    
    private final DinnerService dinnerService;

    @GetMapping("/")
    public String showDinnerMenu(Model model) {
        try {
            String styles = """
            한식, 중식, 일식, 양식, 분식, 국물요리, 덮밥류, 튀김류, 샐러드, 디저트, 면요리, 고기구이, 찜요리, 패스트푸드, 라이스류, 해산물요리,김치찌개, 불고기, 제육볶음
                                 """;
            String menu = dinnerService.recommendDinner(styles);
            model.addAttribute("recommendation", menu);
        } catch (Exception e) {
            model.addAttribute("recommendation", "추천 실패: " + e.getMessage());
        }
        return "main"; 
    }
}
