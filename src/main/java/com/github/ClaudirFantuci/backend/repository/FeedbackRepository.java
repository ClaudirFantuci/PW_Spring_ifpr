package com.github.ClaudirFantuci.backend.repository;

import com.github.ClaudirFantuci.backend.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
