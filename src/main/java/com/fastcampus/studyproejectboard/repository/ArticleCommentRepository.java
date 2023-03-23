package com.fastcampus.studyproejectboard.repository;

import com.fastcampus.studyproejectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
