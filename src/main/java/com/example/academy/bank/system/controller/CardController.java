package com.example.academy.bank.system.controller;

import com.example.academy.bank.system.model.Card;
import com.example.academy.bank.system.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/card")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }
    @PostMapping
    public void createOrUpdateCard(Card card){
        cardService.createOrUpdateCard(card);

    }

}
