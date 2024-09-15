package com.nikesh.circlepeapp.events;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TradeEventProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC = "trade-events";

    // Constructor to inject KafkaTemplate
    public TradeEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // Method to send trade event to the Kafka topic
    public void sendTradeEvent(String tradeDetails) {
        kafkaTemplate.send(TOPIC, tradeDetails);
    }
}
