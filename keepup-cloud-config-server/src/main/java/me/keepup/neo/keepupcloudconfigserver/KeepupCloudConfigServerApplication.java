package me.keepup.neo.keepupcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class KeepupCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeepupCloudConfigServerApplication.class, args);
	}
}
