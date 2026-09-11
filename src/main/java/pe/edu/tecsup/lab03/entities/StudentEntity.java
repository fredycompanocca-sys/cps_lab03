package pe.edu.tecsup.lab03.entities;

public class StudentEntity {
    private Long id;
    private String name;
    private String email;
    private String carrera;

    public StudentEntity() {
    }

    public StudentEntity(Long id, String name, String email, String carrera) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.carrera = carrera;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}