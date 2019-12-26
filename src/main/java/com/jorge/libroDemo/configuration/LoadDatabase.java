package com.jorge.libroDemo.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jorge.libroDemo.entity.Chapter;
import com.jorge.libroDemo.repository.ChapterRepository;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner init(ChapterRepository repository) {
		return args -> {
			Flux.just(
					new Chapter("Quick start with Java"),
					new Chapter("Reactive web with Spring Boot"),
					new Chapter("... and more!"))
					.flatMap(repository::save)
					.subscribe(System.out::println);
		};
	}
}
