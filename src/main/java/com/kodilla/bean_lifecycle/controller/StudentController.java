package com.kodilla.bean_lifecycle.controller;

import com.kodilla.bean_lifecycle.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public Map<Integer, String> createStudents(@RequestParam(defaultValue = "10") int n,
                                               @RequestParam(defaultValue = "10") int z) throws NoSuchFieldException, IllegalAccessException {
        Student[] studentsArray = new Student[n];
        Map<Integer, String> studentsMap = new HashMap<>();

        for (int i = 0; i<n; i++) {
            studentsArray[i] = new Student(z);
        }

        for (Student student : studentsArray) {

            Field indexNumberField = Student.class.getDeclaredField("indexNumber");
            indexNumberField.setAccessible(true);

            String indexNumber = (String) indexNumberField.get(student);
            studentsMap.put(student.hashCode(), indexNumber);
        }

        return studentsMap;
    }

}
