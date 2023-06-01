package fr.antoinebdns.springbootapistarter.config;

import fr.antoinebdns.springbootapistarter.models.SampleModel;
import fr.antoinebdns.springbootapistarter.repositories.SampleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Autowired
    SampleRepository sampleRepository;

    @Bean
    CommandLineRunner initDatabase(){
        return args -> {
            log.info("Preloading "+sampleRepository.save(SampleModel.builder().attribute1("Attribute1").build()));
            log.info("Preloading "+sampleRepository.save(SampleModel.builder().attribute1("Attribute1").build()));
        };
    }
}
