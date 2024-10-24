package com.aamir.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer studentId;
    private String studentName;
    private String studentContactNumber;
    private String studentAddress;
    private String studentGender;
    private String studentDepartment;
    private String studentSkills;
}
