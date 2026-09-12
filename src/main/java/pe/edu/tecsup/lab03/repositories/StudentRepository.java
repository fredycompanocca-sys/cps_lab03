package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;

public interface StudentRepository {
    StudentEntity save(StudentEntity student);
    StudentEntity findById(Long id);
    List<StudentEntity> findAll();
    void delete(Long id);
    // Método agregado en sprint-2 para búsqueda por nombre
    List<StudentEntity> findByName(String name);
}

