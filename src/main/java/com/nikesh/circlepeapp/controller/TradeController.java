package com.nikesh.circlepeapp.controller;

import com.nikesh.circlepeapp.model.Trade;
import com.nikesh.circlepeapp.service.TradeService;
import jakarta.persistence.GeneratedValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trades")
public class TradeController {

    private final TradeService tradeService;


    public TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }


    @PostMapping
    public ResponseEntity<Trade> initiateTrade(@RequestBody Trade trade){
        Trade createdTrade = tradeService.initiateTrade(trade);
        return ResponseEntity.ok(createdTrade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trade> getTrade(@PathVariable Long id) {
        Trade trade = tradeService.getTrade(id);
        return ResponseEntity.ok(trade);
    }
}
