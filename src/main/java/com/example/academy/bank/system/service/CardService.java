package com.example.academy.bank.system.service;

import com.example.academy.bank.system.model.Card;
import com.example.academy.bank.system.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }
    public void createOrUpdateCard(Card card){
        cardRepository.save(card);
    }

}
