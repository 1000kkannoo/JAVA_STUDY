package my.study.testcode.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class TestCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCodeApplication.class, args);
	}

}
