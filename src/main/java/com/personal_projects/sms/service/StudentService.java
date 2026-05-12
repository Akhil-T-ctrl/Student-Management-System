package com.personal_projects.sms.service;

import com.personal_projects.sms.dto.StudentDto;
import jakarta.validation.Valid;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(@Valid StudentDto studentDto);

    void deleteStudentId(Long studentId);
}
