package com.example.accessingdatamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EnrollCourseController {

    @Autowired
    private EnrollCourseService enrollCourseService;

    //add student enroll
    @RequestMapping(path = "/enrollcourse", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Object> addCourse(@RequestBody EnrollCourse stc) {
        
        EnrollCourse resultEnrollCourse = enrollCourseService.add(stc);

        return ResponseEntity.status(HttpStatus.CREATED).body(resultEnrollCourse);
    }
}
