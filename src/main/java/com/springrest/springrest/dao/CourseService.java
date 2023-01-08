package com.springrest.springrest.dao;

import com.springrest.springrest.entity.Course;

import java.util.List;

public interface CourseService {

   public   List<Course> getAllCourses();
   public Course getCourseById(long id);
   public void addCourse(Course course);
   public void updateCourse(Course course);
   public void deleteById(long id);
}
