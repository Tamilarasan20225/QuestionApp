package com.tamil.QuestionApp.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.QuestionApp.models.Question;
import com.tamil.QuestionApp.service.QuestionService;

@RestController
@RequestMapping("questions")
public class QuestionController {
    
    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable("category") String category){
        return questionService.getQuestionByCategory(category);
    }

    @GetMapping("/difficulty/{difficulty}")
    public List<Question>getQuestionByDifficulty(@PathVariable String difficulty){
        return questionService.gQuestionByDifficulty(difficulty);
    }
    @PostMapping("/add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
        
    }
    @DeleteMapping("delete/{question}")
    public String deleteQuestion(@PathVariable String question){
        return questionService.deleteQuestion(question);
    }
    // @GetMapping("update")
    // public String updateQuestion(@RequestBody Question q){
    //     return questionService.updateQuestion(q);
    // }

}
