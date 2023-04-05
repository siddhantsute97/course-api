package org.jspiders.courseapi.controller;

import org.jspiders.courseapi.model.Course;
import org.jspiders.courseapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000/")
@RestController
public class CoursesController {
    @Autowired
    private CourseService service;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return service.getAllCourses();
    }
    @GetMapping("/courses/{id}")
    public Course getCourseByBatchCode(@PathVariable(value = "id")String id){
        return service.getCourseBYBatchCode(id);
    }
    @GetMapping("/faculty")
    public String getFaculty(){
        return service.getFaculty();
    }
    @GetMapping("/faculty/{faculty}")
    public List<Object> getBatchCode(@PathVariable(value = "faculty") String faculty){
       return service.getBatchCode(faculty);
    }
    @GetMapping("/allbatch")
    public List<Object> getAllBatches(){
        return service.getAllBatches();
    }

    @PostMapping("/courses")
    public void addBatch(@RequestBody Course c){
        service.addBatch(c);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteBatch(@PathVariable(value = "id") String id){
        service.deleteBatch(id);
    }
}
