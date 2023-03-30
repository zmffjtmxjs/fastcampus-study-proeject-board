package com.fastcampus.studyproejectboard.repository;

import com.fastcampus.studyproejectboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
