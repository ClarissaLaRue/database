package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "DETAILINFO")
public class DetailedInfo implements Serializable, Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Id
    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Impression")
    private String impression;

    @Column(name = "Classes")
    private String Classes;

    @Column(name = "Dormitory")
    private String Dormitory;

    @Column(name = "Infrastructure")
    private String Infrastructure;

    @Column(name = "Teachers")
    private String Teachers;

    @Column(name = "Scholarship")
    private String Scholarship;

    public Integer getId() {
        return id;
    }

    public Integer getUniversityId() {
        return UniversityId;
    }

    public String getImpression() {
        return impression;
    }

    public String getClasses() {
        return Classes;
    }

    public String getDormitory() {
        return Dormitory;
    }

    public String getInfrastructure() {
        return Infrastructure;
    }

    public String getTeachers() {
        return Teachers;
    }

    public String getScholarship() {
        return Scholarship;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUniversityId(Integer universityId) {
        UniversityId = universityId;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    public void setClasses(String classes) {
        Classes = classes;
    }

    public void setDormitory(String dormitory) {
        Dormitory = dormitory;
    }

    public void setInfrastructure(String infrastructure) {
        Infrastructure = infrastructure;
    }

    public void setTeachers(String teachers) {
        Teachers = teachers;
    }

    public void setScholarship(String scholarship) {
        Scholarship = scholarship;
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
