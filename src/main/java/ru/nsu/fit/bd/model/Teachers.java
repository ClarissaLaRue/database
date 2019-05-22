package ru.nsu.fit.bd.model;

import javax.persistence.*;

@Entity
@Table(name = "TEACHERS")
public class Teachers {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

    @Column(name = "Seminarians")
    private Integer Seminarians;

    @Column(name = "Lecturers")
    private Integer Lecturers;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSeminarians() {
        return Seminarians;
    }

    public void setSeminarians(Integer seminarians) {
        Seminarians = seminarians;
    }

    public Integer getLecturers() {
        return Lecturers;
    }

    public void setLecturers(Integer lecturers) {
        Lecturers = lecturers;
    }
}
