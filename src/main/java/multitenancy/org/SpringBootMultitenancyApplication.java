package multitenancy.org;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "multitenancy.org")
public class SpringBootMultitenancyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultitenancyApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

	}
}
