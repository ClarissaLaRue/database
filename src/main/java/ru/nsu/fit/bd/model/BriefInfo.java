package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "BRIEFINFO")
public class BriefInfo implements Serializable, Entity {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Impression")
    private Float impression;

    @Column(name = "Classes")
    private Float  Classes;

    @Column(name = "Dormitory")
    private Float  Dormitory;

    @Column(name = "Infrastructure")
    private Float  Infrastructure;

    @Column(name = "Teachers")
    private Float  Teachers;

    @Column(name = "ScholarshipDao")
    private Float  Scholarship;

    @Column(name = "Pospects")
    private Float  Pospects;

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

    public Float  getImpression() {
        return impression;
    }

    public void setImpression(Float  impression) {
        this.impression = impression;
    }

    public Float  getClasses() {
        return Classes;
    }

    public void setClasses(Float  classes) {
        Classes = classes;
    }

    public Float  getDormitory() {
        return Dormitory;
    }

    public void setDormitory(Float  dormitory) {
        Dormitory = dormitory;
    }

    public Float  getInfrastructure() {
        return Infrastructure;
    }

    public void setInfrastructure(Float  infrastructure) {
        Infrastructure = infrastructure;
    }

    public Float  getTeachers() {
        return Teachers;
    }

    public void setTeachers(Float  teachers) {
        Teachers = teachers;
    }

    public Float  getScholarship() {
        return Scholarship;
    }

    public void setScholarship(Float  scholarship) {
        Scholarship = scholarship;
    }

    public Float getPospects() {
        return Pospects;
    }

    public void setPospects(Float  pospects) {
        Pospects = pospects;
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
