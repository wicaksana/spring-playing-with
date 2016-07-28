package com.belalangtempur;

import com.belalangtempur.domain.Journal;
import com.belalangtempur.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJournalApplication {

	@Bean
	InitializingBean saveData(JournalRepository repo) {
		return () -> {
			repo.save(new Journal("Lady Midnight","In a secret world where half-angel warriors are sworn to fight demons","03/08/2016"));
			repo.save(new Journal("Harry Potter and the Cursed Child","A new play by Jack Thorne, is the first official Harry Potter story to be presented on stage.","06/31/2016"));
			repo.save(new Journal("Glass Sword ","Mare Barrow’s blood is red—the color of common folk—but her Silver ability, the power to control lightning, has turned her into a weapon that the royal court tries to control","02/09/2016"));
			repo.save(new Journal("When Breath Becomes Air","What makes life worth living in the face of death?","01/19/2016"));
		};
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJournalApplication.class, args);
	}
}
