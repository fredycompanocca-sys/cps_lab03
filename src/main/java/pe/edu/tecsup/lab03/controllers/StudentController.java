package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;
import java.util.List;

public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentEntity createStudent(StudentEntity student) {
        return studentService.createStudent(student);
    }

    public StudentEntity getStudent(Long id) {
        return studentService.getStudent(id);
    }

    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    public StudentEntity updateStudent(StudentEntity student) {
        return studentService.updateStudent(student);
    }

    public void deleteStudent(Long id) {
        studentService.deleteStudent(id);
    }
}