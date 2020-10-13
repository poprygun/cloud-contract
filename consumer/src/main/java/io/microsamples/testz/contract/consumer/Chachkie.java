package io.microsamples.testz.contract.consumer;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
class Chachkie {
	private UUID id;
	private String name;
	private String description;
	private Instant when;
}
