package me.keepup.neo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KeepupCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeepupCloudConfigClientApplication.class, args);
	}
}
