package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "POSPECTS")
public class Pospects implements Serializable, Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "IssueYear")
    private Float IssueYear;

    @Column(name = "StartSelary")
    private Float StartSelary;

    @Column(name = "UsefullStuding")
    private Float UsefullStuding;

    @Column(name = "Placement")
    private Float Placement;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getIssueYear() {
        return IssueYear;
    }

    public void setIssueYear(Float issueYear) {
        IssueYear = issueYear;
    }

    public Float getStartSelary() {
        return StartSelary;
    }

    public void setStartSelary(Float startSelary) {
        StartSelary = startSelary;
    }

    public Float getUsefullStuding() {
        return UsefullStuding;
    }

    public void setUsefullStuding(Float usefullStuding) {
        UsefullStuding = usefullStuding;
    }

    public Float getPlacement() {
        return Placement;
    }

    public void setPlacement(Float placement) {
        Placement = placement;
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
