package com.fastcampus.studyproejectboard.repository;

import com.fastcampus.studyproejectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}