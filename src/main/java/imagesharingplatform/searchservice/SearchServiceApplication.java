package imagesharingplatform.searchservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import imagesharingplatform.searchservice.repository.UserRepository;

@SpringBootApplication
public class SearchServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SearchServiceApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
	    userRepository.findAll().forEach(System.out::println);
	}
}
