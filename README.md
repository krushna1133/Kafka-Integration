###Download KAFKA
Visit site   [Download kafka]([https://kafka.apache.org/community/downloads/])
Use stable version like Scala 2.13 - kafka_2.13-3.9.2.tgz (asc, sha512) [Click Here]([https://dlcdn.apache.org/kafka/3.9.2/kafka_2.13-3.9.2.tgz])

Extract this file
copy the file from > kafka_2.13-3.9.2 > config: 
  - zookeeper.properties
  - server.properties

paste in kafka_2.13-3.9.2 > bin > windows:
      paste here

###Open CMD as administrator
 In:
 - kafka_2.13-3.9.2 > bin > windows
   - zookeeper-server-start.bat zookeeper.properties
   - kafka-sever-start.bat server.properties
       - If wmin not found
          - Open file 'kafka-sever-start' and remove wmin text and make this as
                                 IF ["%KAFKA_HEAP_OPTS%"] EQU [""] (
                            set KAFKA_HEAP_OPTS=-Xmx1G -Xms1G
                    )
                )
   

#To create maven project 
visit [maven project]([https://start.spring.io/])
  - Java
  - Maven
  - stable version (4.0.3)
  - Group com.example   Artifact producer
    Name producer  Description Demo project for Spring Boot
    Package name com.telusko.kafka
  - Jar
  - YAML
  - Java 17

**Dependencies**
 - Spring web
 - Spring boot dev tools
 - Spring for Apache Kafka

_click Generate_



# If you direct download this Two Files (consumer, producer)
 _After run both file_
###To check in postman
For Send data
Method: POST
URL: http://localhost:8081/kafka/add-course
Body -> raw: {
                "courseId": "Jtelusko01",
                "title": "Java SpringBoot",
                "trainer": "Navin Reddy",
                "price": 6500
            }

To Receive data
Method: GET
URL: http://localhost:8082/kafka/get-course


