package com.nikesh.circlepeapp.service;

import com.nikesh.circlepeapp.model.Trade;
import com.nikesh.circlepeapp.repository.TradeRepository;
import org.springframework.stereotype.Service;

@Service
public class TradeService {

    private final TradeRepository tradeRepository;

    public TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    // Method to initiate a new trade
    public Trade initiateTrade(Trade trade) {
        // Logic to save the trade in the database
        return tradeRepository.save(trade);
    }

    // Method to get an existing trade by ID
    public Trade getTrade(Long id) {
        // Logic to retrieve the trade from the database
        return tradeRepository.findById(id).orElseThrow(() -> new RuntimeException("Trade not found"));
    }
}
