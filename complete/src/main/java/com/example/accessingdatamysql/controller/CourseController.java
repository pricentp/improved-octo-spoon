package com.example.accessingdatamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
    
    @Autowired
    private CourseService courseService;

    //add course
    @RequestMapping(path = "/addcourse", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Object> addCourse(@RequestBody Course course) {
        
        Course resultCourse = courseService.save(course);

        return ResponseEntity.status(HttpStatus.OK).body(resultCourse);
    }
}