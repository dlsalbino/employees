package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class EmployeeService {
    public Collection<Employee> listAll() {
        return Arrays.asList(
                Employee.builder().name("Charles Finney").role("Software Engineer").build(),
                Employee.builder().name("Caroline Steves").role("Software Manager").build(),
                Employee.builder().name("Priyanka Chopra").role("Actress").build()
        );
    }
}
