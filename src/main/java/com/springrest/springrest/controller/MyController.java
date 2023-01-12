package com.springrest.springrest.controller;

import com.springrest.springrest.dao.CourseService;
import com.springrest.springrest.entity.Course;
import com.springrest.springrest.model.CatFactResponse;
import com.springrest.springrest.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class MyController {
   @Autowired
    private CourseService courseService;

    @Autowired
    private CatService catService;


    @GetMapping("/home")
    public String home(){
        return "this is my first home";
    }

    @GetMapping("/courses")
    public  List<Course> courseList(){
        return this.courseService.getAllCourses();
    }

    @GetMapping("/course/{courseId}")
    public  Course getCourse(@PathVariable long courseId){
        return this.courseService.getCourseById(courseId);
    }

    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course)
    {
        this.courseService.addCourse(course);
        return "Course details with"+course.getCourseName()+" course name is added successfully";
    }

    @PutMapping("/courses")
    public String updateCourse(@RequestBody Course course)
    {
        this.courseService.updateCourse(course);
        return "Updated Successfully";
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourse(@PathVariable long id){
        this.courseService.deleteById(id);
        return "Delete done for id ==="+id;
    }

    @GetMapping("/cat-fact")
    public CatFactResponse getCatFact(){
        return catService.getCatFact();
    }
}
