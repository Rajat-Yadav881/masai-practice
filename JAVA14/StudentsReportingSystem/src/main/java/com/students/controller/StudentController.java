package com.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.model.Semester;
import com.students.model.Student;
import com.students.service.SemesterService;
import com.students.service.StudentSemesterService;
import com.students.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @Autowired
    private SemesterService semesterService;
    
    @Autowired
    private StudentSemesterService studentSemesterService;
    
    @PostMapping("/")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student savedStudent = studentService.addStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @PostMapping("/{studentId}/semesters")
    public ResponseEntity<Semester> addSemester(@PathVariable Integer studentId, @RequestBody Semester semester) {
        Semester savedSemester = semesterService.addSemester(studentId, semester);
        return new ResponseEntity<>(savedSemester, HttpStatus.CREATED);
    }

    @GetMapping("/reports/averagePercentage")
    public ResponseEntity<Double> getAveragePercentage() {
        Double averagePercentage = studentSemesterService.getAveragePercentageOfRecentSemester();
        return new ResponseEntity<>(averagePercentage, HttpStatus.OK);
    }

    @GetMapping("/reports/averageMarks/{subject}")
    public ResponseEntity<Double> getAverageMarksBySubject(@PathVariable String subject) {
        Double averageMarks = studentSemesterService.getAverageMarksInSubject(subject);
        return new ResponseEntity<>(averageMarks, HttpStatus.OK);
    }

    @GetMapping("/reports/topConsistentStudents")
    public ResponseEntity<List<Student>> getTopConsistentStudents() {
        List<Student> topStudents = studentSemesterService.getTop2ConsistentStudents();
        return new ResponseEntity<>(topStudents, HttpStatus.OK);
    }
}
