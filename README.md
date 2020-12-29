This project performs communication betwen microservices via kafka async messaging.

It uses docker compose to create the docker containers.

They are developed using spring boot. 

Once an order is placed from UI, the Order microservices publishes an event to the kafka topic. 
The Shipment microservice which has subscribed for this topic receives it and processes the notification.

You can also start a shell on the Kafka server,
docker exec -it mskafka_kafka_1 /bin/sh 
and then take a look at the records in the topic using 
kafka-console-consumer.sh --bootstrap-server kafka:9092 --topic orderTopic --from-beginning.
