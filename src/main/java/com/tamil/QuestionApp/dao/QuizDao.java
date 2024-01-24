package com.tamil.QuestionApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.QuestionApp.models.Quiz;
@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer>{

    List<Quiz> findByTitle(String title);
    
   
}
