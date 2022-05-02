package cz.inventi.kpj.kpjtesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KpjTestingApplication  implements CommandLineRunner {

  @Autowired
  KpjTesting kpjTesting;

	public static void main(String[] args) {
		SpringApplication.run(KpjTestingApplication.class, args);
	}


  @Override
  public void run(String... args) throws Exception {
    kpjTesting.printEcho("KPJ Testing rulez!");
  }

}
