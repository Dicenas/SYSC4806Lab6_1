package com.lab6.BuddyAddressBook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BuddyAddressBookApplication {
	private static final Logger log = LoggerFactory.getLogger(BuddyAddressBookApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BuddyAddressBookApplication.class, args);
	}

    /*
    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new BuddyInfo("Tom", "123 Navan", "613-555-5555"));
            repository.save(new BuddyInfo("Cristy", "321 Bronson", "416-555-5555"));

            // fetch all customers
            log.info("Buddies found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach(buddyInfo -> {
                log.info(buddyInfo.getBuddyInfo());
            });
            log.info("");

            // fetch an individual customer by ID
            BuddyInfo buddy = repository.findById(1);
            log.info("Buddy found with findById(1):");
            log.info("--------------------------------");
            log.info(buddy.getBuddyInfo());
            log.info("");

            // fetch customers by last name
            log.info("Buddy found with findByBuddyName('Cristy'):");
            log.info("--------------------------------------------");
            repository.findByName("Cristy").forEach(cristy -> {
                log.info(cristy.getBuddyInfo());
            });
            log.info("");
        };
    }

     */

}