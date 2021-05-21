package io.gauravgupta.servicea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceAApplication {

	@Value("${version}")
	private String version;

	private String test;

	@Value("${name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

	@GetMapping("/version")
	public String getVersion() {
		return String.format("Service A hello test  v=%s", version)+String.format("\n name=%s", name);
	}

}
