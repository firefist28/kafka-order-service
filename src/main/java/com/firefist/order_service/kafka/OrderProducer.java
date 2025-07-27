package com.firefist.order_service.kafka;

import com.firefist.order_service.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private final String topic = "orders";

    public void sendOrder(Order order) {
        kafkaTemplate.send(topic, order.toString());
        System.out.println("Published to Kafka: " + order);
    }
}
