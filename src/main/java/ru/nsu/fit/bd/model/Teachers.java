package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "TEACHERS")
public class Teachers implements Serializable, Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Seminarians")
    private Float Seminarians;

    @Column(name = "Lecturers")
    private Float Lecturers;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Float getSeminarians() {
        return Seminarians;
    }

    public void setSeminarians(Float seminarians) {
        Seminarians = seminarians;
    }

    public Float getLecturers() {
        return Lecturers;
    }

    public void setLecturers(Float lecturers) {
        Lecturers = lecturers;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
