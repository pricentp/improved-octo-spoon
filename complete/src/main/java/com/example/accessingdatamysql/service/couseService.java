package com.example.accessingdatamysql.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatamysql.model.Student;
import com.example.accessingdatamysql.service.repo.StudentRepository;
import com.example.accessingdatamysql.service.repo.entity.StudentEntity;

@Service    
public class couseService {
    private StudentRepository studentRepository;

    public Course save(Course course) {
        CourseEntity CourseEntity = new CourseEntity();
        CourseEntity.setCourseID(course.getCourseID());
        CourseEntity.setName(course.getName());
        CourseEntity.setCredit(course.getCredit());
        CourseEntity.setMaxSeat(course.getMaxSeat());


		CourseEntity resultCourseEntity = studentRepository.save(CourseEntity);


        Student resultCourse = new Student();
        resultCourse.setCourseId(resultCourseEntity.getCourseId());
        resultCourse.setName(resultCourseEntity.getName());
        resultCourse.setCredit(resultCourseEntity.getCredit());
        resultCourse.setMaxSeat(resultCourseEntity.getMaxSeat());

        return resultCourse;
    }
}