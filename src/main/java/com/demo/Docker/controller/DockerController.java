package com.demo.Docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Docker.model.ClientCodeDtls;
import com.demo.Docker.repo.ClientRepository;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/docker")
public class DockerController {

	private static final Logger log = LogManager.getLogger(DockerController.class);
	
	@Autowired
	ClientRepository clientRepository;

	@GetMapping("/store")
	public String index() {
		log.info("index :");
		return "Storing this data in docker Hub.";
	}

	@GetMapping("/getdata")
	public String getdata() {
		log.info("getdata :");
		return "getdata this data in docker Hub.";
	}

	@GetMapping("/testing")
	public String testing() {
		log.info("testing :");
		return "testing this data in docker Hub.";
	}

	@GetMapping("/clientUpload")
	public ResponseEntity<?> clientUpload(@RequestParam String pan) {
		try {

			Optional<ClientCodeDtls> clientCodeDtls =clientRepository.findByCcdPan(pan);
			
			if (clientCodeDtls.isPresent()) {
			    ClientCodeDtls client = clientCodeDtls.get();

				log.info(clientCodeDtls);
			}
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(clientCodeDtls);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error while uploading client : " + e.getMessage());
		}
	}
}
