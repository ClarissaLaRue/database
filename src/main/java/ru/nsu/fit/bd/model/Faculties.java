package ru.nsu.fit.bd.model;

import javax.persistence.*;

@Entity
@Table(name = "FACULTIES")
public class Faculties {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Id
    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Name")
    private String[] Name;

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

    public String[] getName() {
        return Name;
    }

    public void setName(String[] name) {
        Name = name;
    }
}
