This project demonstrates asynchronous communication between microservices using Apache Kafka.
In this implementation, Kafkauser-Service acts as a Kafka Producer and sends messages to a Kafka Topic. 
The Consumer Service listens to the topic and processes the received messages asynchronously.
Apache Kafka enables reliable, loosely coupled, and asynchronous communication between microservices.

Producer Implementation
Kafkauser-Service acts as a producer and publishes messages to the Kafka topic using Spring Kafka.
The producer sends messages without waiting for the consumer to process them.

 Kafka Server Setup
 Installed Apache Kafka and ZooKeeper on the local machine.
 Start ZooKeeper Server
 server-start.bat config/zookeeper.properties
 Start Kafka Server
 kafka-server-start.bat config/server.properties

 Create Kafka Topic
 kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092  --partitions 1 --replication-factor 1

 I implemented asynchronous communication between two microservices using Apache Kafka. 
 I developed Kafkauser-Service as a producer and another service as a consumer. I installed and configured Kafka and ZooKeeper locally, started both servers through CMD,
 created Kafka topics using Kafka CLI commands, and integrated Spring Kafka for publishing and consuming messages.
