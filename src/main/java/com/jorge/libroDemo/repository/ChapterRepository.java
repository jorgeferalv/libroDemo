package com.jorge.libroDemo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.jorge.libroDemo.entity.Chapter;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String>{
}
