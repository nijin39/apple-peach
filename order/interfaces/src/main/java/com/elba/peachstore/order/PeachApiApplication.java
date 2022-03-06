package com.elba.peachstore.order;

import com.elba.peachstore.order.configuration.PeachApiContextConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import(value = {
		PeachApiContextConfig.class,
//		KafkaMessageConfiguration.class,
//		DummyConfiguration.class
})
public class PeachApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(PeachApiApplication.class, args);
	}
}
