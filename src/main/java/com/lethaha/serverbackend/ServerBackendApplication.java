package com.lethaha.serverbackend;

import com.lethaha.serverbackend.enumeration.Status;
import com.lethaha.serverbackend.model.Server;
import com.lethaha.serverbackend.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerBackendApplication.class, args);
	}

    @Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.166", "Android","16 GB", "GALAXY SE", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP ));
			serverRepo.save(new Server(null, "192.168.1.165", "Android","8 GB", "GALAXY OLD", "http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN ));
		};

	}

}
