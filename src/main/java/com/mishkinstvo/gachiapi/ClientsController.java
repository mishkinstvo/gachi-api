package com.mishkinstvo.gachiapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("clients")
public class ClientsController {

	private List<Client> clients;

	@Autowired
	public ClientsController(ObjectMapper mapper,
			@Value("classpath:data/clients.json") Resource clientResource) throws IOException {
		this.clients = mapper.readValue(clientResource.getURL(), new TypeReference<>() {});
	}

	@GetMapping
	public Collection<Client> all() {
		return clients;
	}

	@GetMapping("/{id}")
	public Optional<Client> find(@PathVariable("id")BigInteger id) {
		return clients.stream()
				.filter(client -> id.equals(client.id))
				.findFirst();
	}
}
