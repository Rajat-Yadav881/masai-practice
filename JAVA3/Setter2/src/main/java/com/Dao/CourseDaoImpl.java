package com.Dao;

import com.exception.CourseNotFoundException;
import com.model.Course;
import com.utility.EmUtility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CourseDaoImpl implements CourseDao{
    @Override
    public void addCourse(Course course)  {
        EntityManager em = EmUtility.provideEntityManager();

        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
        System.out.println("new course has been added");

    }

    @Override
    public void getCourse(int course_id) throws CourseNotFoundException {
        EntityManager em = EmUtility.provideEntityManager();
        Course course = em.find(Course.class,course_id);
        if (course==null)
            throw new CourseNotFoundException("sorry no course is allocated");
        System.out.println(course);
    }
}
