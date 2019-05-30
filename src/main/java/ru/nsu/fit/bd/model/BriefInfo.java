package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BRIEFINFO")
public class BriefInfo implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Id
    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Impression")
    private Integer impression;

    @Column(name = "Classes")
    private Integer Classes;

    @Column(name = "Dormitory")
    private Integer Dormitory;

    @Column(name = "Infrastructure")
    private Integer Infrastructure;

    @Column(name = "Teachers")
    private Integer Teachers;

    @Column(name = "Scholarship")
    private Integer Scholarship;

    @Column(name = "Pospects")
    private Integer Pospects;

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

    public Integer getImpression() {
        return impression;
    }

    public void setImpression(Integer impression) {
        this.impression = impression;
    }

    public Integer getClasses() {
        return Classes;
    }

    public void setClasses(Integer classes) {
        Classes = classes;
    }

    public Integer getDormitory() {
        return Dormitory;
    }

    public void setDormitory(Integer dormitory) {
        Dormitory = dormitory;
    }

    public Integer getInfrastructure() {
        return Infrastructure;
    }

    public void setInfrastructure(Integer infrastructure) {
        Infrastructure = infrastructure;
    }

    public Integer getTeachers() {
        return Teachers;
    }

    public void setTeachers(Integer teachers) {
        Teachers = teachers;
    }

    public Integer getScholarship() {
        return Scholarship;
    }

    public void setScholarship(Integer scholarship) {
        Scholarship = scholarship;
    }

    public Integer getPospects() {
        return Pospects;
    }

    public void setPospects(Integer pospects) {
        Pospects = pospects;
    }
}
