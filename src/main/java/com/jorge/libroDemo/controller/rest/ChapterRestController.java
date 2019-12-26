package com.jorge.libroDemo.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorge.libroDemo.entity.Chapter;
import com.jorge.libroDemo.repository.ChapterRepository;

import reactor.core.publisher.Flux;

@RestController
public class ChapterRestController {
	
	//@Autowired
	private final ChapterRepository chapterRepository;
	
	public ChapterRestController(ChapterRepository chapterRepository) {
		this.chapterRepository = chapterRepository;
	}
	
	@GetMapping("/chapters")
	public Flux<Chapter> getAllChapter(){
		return chapterRepository.findAll();
	}
}
