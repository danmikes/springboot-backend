package backend;

import backend.model.User;
import backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootBackendApplication.class, args);
  }

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String...args) throws Exception {
    this.userRepository.save(new User("Max", "Mix", "max@mix.te"));
    this.userRepository.save(new User("Alpha", "Beta", "alpha@beta.te"));
    this.userRepository.save(new User("Gamma", "Delta", "gamma@delta.te"));
  }
}
