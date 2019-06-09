package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "FACULTIES")
public class Faculties implements Serializable, Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Name")
    private String Name;

    public Faculties(int universityID, String name) {
        this.UniversityId = universityID;
        this.Name = name;
    }

    public Faculties() {

    }

    public Faculties(String name) {
        this.Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUniversityId() {
        return UniversityId;
    }

    public void setUniversityId(Integer universityId) {
        UniversityId = universityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
