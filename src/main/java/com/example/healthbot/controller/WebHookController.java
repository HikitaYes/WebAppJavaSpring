//package com.example.healthbot.controller;
//
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import com.example.healthbot.HealthServiceTelegramBot;
//
//@RestController
//public class WebHookController {
//    private final HealthServiceTelegramBot telegramBot;
//
//    public WebHookController(HealthServiceTelegramBot telegramBot) {
//        this.telegramBot = telegramBot;
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
//        return telegramBot.onUpdateReceived(update);
//    }
//
//}
