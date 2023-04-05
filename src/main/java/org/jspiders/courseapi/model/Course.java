package org.jspiders.courseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {
    private String batchCode;
    private String subject;
    private String faculty;
    private int totalClasses;

}
