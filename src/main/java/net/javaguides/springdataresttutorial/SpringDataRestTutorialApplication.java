package net.javaguides.springdataresttutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springdataresttutorial.entity.User;
import net.javaguides.springdataresttutorial.repository.UserRepository;

@SpringBootApplication
public class SpringDataRestTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestTutorialApplication.class, args);
	}
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception{
		User user = User.builder().firstName("Ramesh").lastName("Priri").email("piri@gmail.com").build();
		userRepository.save(user);
		User user1 = User.builder().firstName("Ciccio").lastName("pasticcio").email("pasticcio@gmail.com").build();
		userRepository.save(user1);
		User user2 = User.builder().firstName("Lorenzo").lastName("Matterazzo").email("lorenzomat@gmail.com").build();
		userRepository.save(user2);
		User user3 = User.builder().firstName("Gianfranco").lastName("peraro").email("gianfranco@gmail.com").build();
		userRepository.save(user3);
	}
}
