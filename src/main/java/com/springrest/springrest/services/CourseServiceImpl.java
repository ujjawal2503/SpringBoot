package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseService;
import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    List<Course> list;
    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1,"Java","This is a programming language"));
        list.add(new Course(2,"SpringBoot","This is a Framework "));
        list.add(new Course(3,"Machine learning","Data analytics and Python knowledge is required for ML"));


    }

    @Override
    public List<Course> getAllCourses() {
        return list;
    }

    @Override
    public Course getCourseById(long id) {
        Course c = null;
        for(Course course: list){
            if(course.getCourseId()==id){
                c=course;
                break;
            }
        }
        return c;

    }

    @Override
    public void addCourse(Course course) {
        list.add(course);
    }

    @Override
    public void updateCourse(Course course) {
        for(Course c: list){
            if(course.getCourseId()==c.getCourseId()){
                c.setCourseName(course.getCourseName());
                c.setDescription(course.getDescription());
                break;
            }
        }
    }

    @Override
    public void deleteById(long id) {
        for(Course course: list){
            if(course.getCourseId()==id){
                list.remove(course);
                break;
            }
        }
    }

}
