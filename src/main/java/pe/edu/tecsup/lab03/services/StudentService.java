package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;

public class StudentService {

    public StudentEntity createStudent(StudentEntity student) {
        return student;
    }


    public StudentEntity getStudent(Long id) {
        return null;
    }

    public List<StudentEntity> getAllStudents() {
        return null;
    }

    public StudentEntity updateStudent(StudentEntity student) {
        return student;
    }

    public void deleteStudent(Long id) {
    }

    // Método agregado en sprint-2 para validar datos del estudiante
    public boolean isValidStudent(StudentEntity student) {
        return student != null && student.getName() != null;
    }
}