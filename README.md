# kafka-order-service

# 🛒 Order Service

The **Order Service** is a Spring Boot microservice responsible for placing customer orders and publishing them to a Kafka topic for downstream processing.

---

## 📌 Features

- Exposes a REST API to place orders
- Publishes order events to Kafka (`orders` topic)
- Uses Apache Kafka for decoupled, event-driven communication

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Apache Kafka
- Gradle
- Docker (for Kafka broker)

---

## 🚀 API Endpoint

### `POST /api/orders`

**Description:** Create a new order and publish it to Kafka

**Request Body:**
```json
{
  "orderId": "ORD123",
  "productId": "PROD456",
  "quantity": 2
}

