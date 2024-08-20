package com.searchservice;

import com.etiya.corepackage.abstractions.events.Event;
import com.etiya.corepackage.abstractions.messaging.transport.EventBusSubscriber;
import com.etiya.corepackage.messaging.transport.kafka.consumer.KafkaMessageConsumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

@Configuration
@EnableKafka
public class KafkaConsumerConfiguration {

    @Bean
    public EventBusSubscriber eventBusSubscriber(DefaultKafkaConsumerFactory<String, Event> consumerFactory){
        return new KafkaMessageConsumer(consumerFactory);
    }
}
