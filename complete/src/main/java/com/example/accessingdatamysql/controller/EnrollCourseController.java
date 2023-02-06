package com.example.accessingdatamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.accessingdatamysql.service.RegisterService;
import com.example.accessingdatamysql.model.Register;


@Controller
public class EnrollCourseController {

    @Autowired
    private RegisterService registerService;

    //add student enroll
    @RequestMapping(path = "/registercourse", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Object> addCourse(@RequestBody Register register) {
        
        Register resultRegister = registerService.save(register);

        return ResponseEntity.status(HttpStatus.OK).body(resultRegister);
    }
}
