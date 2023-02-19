# Kafka_Basic_Implementation_demo

Kafka implementation with producer and consumer model.

Apache Kafka is publish-subscribe based fault tolerant messaging system. It is fast, scalable and distributed by design.

steps to run the cloned application:
1.Download kafka from "https://kafka.apache.org/downloads.html" this path.
2.Run below commands inside kafka folder
Commands to start Zookeeper and Kafka:
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties
3.Hit the path 'http://localhost:9090/api/producerinput?message="First message from producer" ', you can see the output on your console.
