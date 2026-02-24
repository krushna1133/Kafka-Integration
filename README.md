# Kafka Producer–Consumer using Spring Boot

This project demonstrates a simple Kafka Producer and Consumer built using Spring Boot.

---

## 1️⃣ Install Apache Kafka (Windows)

### Step 1: Download Kafka

Visit:

https://kafka.apache.org/downloads

Download a stable version:

- Scala 2.13  
- kafka_2.13-3.9.2.tgz  

Example direct link:
https://dlcdn.apache.org/kafka/3.9.2/kafka_2.13-3.9.2.tgz

---

### Step 2: Extract Kafka

Extract the downloaded file.

You will get a folder like:


kafka_2.13-3.9.2


---

### Step 3: Start Zookeeper and Kafka Server

Open **Command Prompt as Administrator**

Navigate to:


kafka_2.13-3.9.2\bin\windows


Start Zookeeper:


zookeeper-server-start.bat ....\config\zookeeper.properties


Start Kafka Server:


kafka-server-start.bat ....\config\server.properties


---

### If `wmic` error appears

Open:


kafka-server-start.bat


Replace heap configuration section with:


IF "%KAFKA_HEAP_OPTS%"=="" (
set KAFKA_HEAP_OPTS=-Xmx1G -Xms1G
)


Save and restart.

---

## 2️⃣ Create Spring Boot Project

Go to:

https://start.spring.io/

Use the following configuration:

- Project: Maven  
- Language: Java  
- Spring Boot: 4.0.3  
- Packaging: Jar  
- Java: 17  
- Config: YAML  

### Producer Project

- Group: com.telusko  
- Artifact: producer  
- Package: com.telusko.kafka  

### Consumer Project

- Group: com.telusko  
- Artifact: consumer  
- Package: com.telusko.kafka  

### Dependencies

- Spring Web  
- Spring Boot DevTools  
- Spring for Apache Kafka  

Click **Generate**.

---

## 3️⃣ Required Dependency (Important)

If using JsonSerializer / JsonDeserializer, ensure:

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
</dependency>

Or include:

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
4️⃣ Running the Applications

Start Zookeeper

Start Kafka Server

Run Producer (Port 8081)

Run Consumer (Port 8082)

5️⃣ API Testing (Postman)
Send Data (Producer)

Method: POST

http://localhost:8081/kafka/add-course

Body → raw → JSON

{
  "courseId": "Jtelusko01",
  "title": "Java SpringBoot",
  "trainer": "Navin Reddy",
  "price": 6500
}
Receive Data (Consumer)

Method: GET

http://localhost:8082/kafka/get-course
Architecture Flow
Postman → Producer (8081) → Kafka Topic → Consumer (8082)
Common Issues
YAML Error

Use spaces only. Do NOT use TAB for indentation.

Jackson ClassNotFoundException

Add jackson-databind dependency.

Wrong Serializer/Deserializer

Producer → Serializer
Consumer → Deserializer

Tech Stack

Java 17

Spring Boot 4.x

Apache Kafka 3.9.x

Maven

Postman


---

This is clean, properly formatted, and GitHub-ready.
