package com.tamil.QuestionApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.QuestionApp.models.Quiz;
import com.tamil.QuestionApp.service.QuizService;




@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;


    
    @PostMapping("create")
    public String createQuiz(@RequestParam("category") String category,@RequestParam("noOfQuestions") int noOfQuestions,@RequestParam("title") String title){
        return quizService.createQuiz(category,noOfQuestions,title);
        // StringBuilder str=new StringBuilder();
        // str.append(category);
        // // str.append(Integer.toString(noOfQuestions));
        // str.append(title);
        // return str.toString();
        // return "succ";
    }

    @GetMapping("{title}")
    public String getQuiz(@PathVariable("title") String title,Model model){
        model.addAttribute("quiz",quizService.getQuiz(title));
        return "success";
       
        // return basic;
    }
   
    @GetMapping("check")
    public String check(){
        return "check";
    }
}
