package com.tamil.QuestionApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.QuestionApp.models.Question;
import com.tamil.QuestionApp.dao.QuestionDao;
import com.tamil.QuestionApp.dao.QuizDao;
import com.tamil.QuestionApp.models.Quiz;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public String createQuiz(String category, int noOfQuestions,String title) {
        List<Question>questions=questionDao.findRandomQuestionsByCategory(category,noOfQuestions);
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return "Success";
    }

    public List<Quiz> getQuiz(String title) {
        return quizDao.findByTitle(title);
    }

}
