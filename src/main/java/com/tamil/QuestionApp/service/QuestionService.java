package com.tamil.QuestionApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.QuestionApp.dao.QuestionDao;
import com.tamil.QuestionApp.models.Question;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionByCategory( String category) {
        return questionDao.findByCategory(category);
    }

    public List<Question>gQuestionByDifficulty(String difficulty){
        return questionDao.findByDifficulty(difficulty);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }

    public String deleteQuestion(String question) {
        questionDao.deleteByQuestion(question);
        return "Success";
    }

    // public String updateQuestion( Question q) {
    //     questionDao.update
    //     return "Success";
    // }

    

    

}
