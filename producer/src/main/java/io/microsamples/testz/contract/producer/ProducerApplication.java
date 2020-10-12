package io.microsamples.testz.contract.producer;

import lombok.Builder;
import lombok.Value;
import org.jeasy.random.EasyRandom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.time.Instant;
import java.util.UUID;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}

@RestController
class ChachkieController {
	private EasyRandom easyRandom = new EasyRandom();

	@GetMapping(value = "/chachkies", produces = MediaType.APPLICATION_JSON_VALUE)
	Chachkie getChachkie() {
		return easyRandom.nextObject(Chachkie.class);
	}
}

@Value
@Builder
class Chachkie {
    private UUID id;
    private String name;
    private String description;
    protected Instant when;
}