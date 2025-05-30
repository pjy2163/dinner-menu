# 🍽️ 오늘 뭐 먹지? - Groq 기반 저녁 메뉴 추천 웹앱

Spring Boot와 [Groq API](https://console.groq.com/)를 활용해 LLM(대형 언어 모델)이 오늘 저녁 메뉴를 추천해주는 웹 애플리케이션입니다.

---

## 🖼️ 미리보기

> 📸 ![image](https://github.com/user-attachments/assets/84cd2c76-7bbb-4a64-b0cb-e021a5a8eb59)


---

## 🚀 프로젝트 개요

- 사용자가 웹페이지에 접속하면 AI가 그날의 저녁 메뉴를 추천해줍니다.
- Groq의 LLaMA3 모델을 통해 다양한 음식 스타일을 기반으로 자연스러운 추천이 이루어집니다.
- `Spring AI`를 이용해 LLM을 쉽게 연동하고, `Thymeleaf`로 결과를 화면에 출력합니다.

---

## 🛠️ 기술 스택

| 구분 | 기술 |
|------|------|
| Language | Java 17 |
| Backend | Spring Boot 3.x |
| AI 연동 | Spring AI, Groq API |
| View Template | Thymeleaf |
| Build Tool | Maven |


---

## 📂 프로젝트 구조

```bash
src
└── main
    ├── java/com.parang.dinner_menu
    │   ├── controller/          # ViewController, MenuController
    │   ├── service/             # DinnerService - LLM 호출
    │   └── prompt/              # PromptProvider - 프롬프트 생성
    └── resources
        ├── templates/           # main.html
        └── application.yml      # Groq API 설정
