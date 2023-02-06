package com.example.accessingdatamysql.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.accessingdatamysql.service.repo.CourseRepository;
import com.example.accessingdatamysql.service.repo.entity.CourseEntity1;
import com.example.accessingdatamysql.model.course;

@Service    
public class courseService {
    private CourseRepository courseRepository;

    public course save(course course) {
        CourseEntity1 CourseEntity = new CourseEntity1();
        CourseEntity.setCourseId(course.getCourseid());
        CourseEntity.setName(course.getName());
        CourseEntity.setCredit(course.getCredit());
        CourseEntity.setMaxSeat(course.getMaxSeat());


		CourseEntity1 resultCourseEntity = courseRepository.save(CourseEntity);


        course resultCourse = new course();
        resultCourse.setCourseid(resultCourseEntity.getCourseId());
        resultCourse.setName(resultCourseEntity.getName());
        resultCourse.setCredit(resultCourseEntity.getCredit());
        resultCourse.setMaxSeat(resultCourseEntity.getMaxSeat());

        return resultCourse;
    }
}