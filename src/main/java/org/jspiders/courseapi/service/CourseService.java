package org.jspiders.courseapi.service;

import org.jspiders.courseapi.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CourseService {
    List<Course> courseList = new ArrayList<>();
    {
        courseList.add(new Course("1CDJ2","JAVA","AYUSH",2));
        courseList.add(new Course("1JSD3","SQL","EKTA",4));
        courseList.add(new Course("1ECS9","J2EE","AKSHAY",2));
        courseList.add(new Course("1QDT8","WEB","SUDESH",4));
        courseList.add(new Course("1WETD","SPRING","AKSHAY",5));
    }

    public List<Course> getAllCourses(){
        return courseList;
    }

    public Course getCourseBYBatchCode(String id){
        for (int a=0;a<courseList.size();a++){
            Course cor=courseList.get(a);
            if (cor.getBatchCode().equals(id)){
                return cor;
            }
        }
        return null;
    }

    public String getFaculty() {
        Set<String> allFaculty=new HashSet<>();
        for (int a = 0; a < courseList.size(); a++) {
                Course cor1=courseList.get(a);
                allFaculty.add(cor1.getFaculty());
        }
        return allFaculty.toString();
    }

    public List<Object> getBatchCode(String faculty){
        List<Object> batchCode= new ArrayList<>();
        for (int a=0;a<courseList.size();a++){
            Course course=courseList.get(a);
            if (course.getFaculty().equals(faculty)){
                batchCode.add(course.getBatchCode());
            }
        }
        return batchCode;
    }

    public List<Object>getAllBatches(){
        List<Object> allBatches=new ArrayList<>();
        for (int a=0;a<courseList.size();a++){
            Course course=courseList.get(a);
            if (course.getTotalClasses()>50){
                allBatches.add(course.getBatchCode());
            }
        }
        return allBatches;
    }

    public void addBatch(Course c){
        courseList.add(c);
    }

    public void deleteBatch(String id){
        for (int a=0;a<courseList.size();a++){
            Course cor3=courseList.get(a);
            if (cor3.getBatchCode().equals(id)){
                courseList.remove(a);
            }
        }
    }
}
