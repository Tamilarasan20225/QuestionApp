package com.tamil.QuestionApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tamil.QuestionApp.models.Question;

@Repository
public interface QuestionDao  extends JpaRepository<Question,Integer>{

    List<Question> findByCategory(String category);

    List<Question> findByDifficulty(String difficulty);

    void deleteByQuestion(String question);

    @Query(value="Select * from question q where q.category=?1 order by Random() limit ?2",nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int noOfQuestions);

    

  
    

}
