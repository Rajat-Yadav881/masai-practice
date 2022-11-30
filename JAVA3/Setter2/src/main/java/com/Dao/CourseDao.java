package com.Dao;

import com.exception.CourseNotFoundException;
import com.model.Course;

public interface CourseDao {
    public void addCourse(Course course);
    public void getCourse(int course_id) throws CourseNotFoundException;
}
