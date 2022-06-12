package com.faza.example.dynamickafkaconsumer;

import java.time.Duration;
import java.util.*;
import java.io.*;


import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.ConsumerRecord;


public class ManualConsumer {

//    public static void main(String[] args) throws Exception {
//
//        String topicName = "SupplierTopic";
//        String groupName = "SupplierTopicGroup";
//
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("group.id", groupName);
//        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("enable.auto.commit", "false");
//
//        KafkaConsumer<String, String> consumer = null;
//
//        try {
//            consumer = new KafkaConsumer<>(props);
//            consumer.subscribe(Arrays.asList(topicName));
//
//            while (true) {
//                Duration duration= Duration.ofSeconds(10);
//                ConsumerRecords<String, String> records = consumer.poll(duration);
//                for (ConsumerRecord<String, String> record : records) {
//                    System.out.println("Supplier id= " + String.valueOf(record.value()));
//                }
//                consumer.commitAsync();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            consumer.commitSync();
//            consumer.close();
//        }
//    }

}