package src.SpringBootBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

	@GetMapping("/v1/api/hello")
	public static String hello() {
		return "Hello, World!";
	}

}
