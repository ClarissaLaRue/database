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
    private Integer IssueYear;

    @Column(name = "StartSelary")
    private Integer StartSelary;

    @Column(name = "UsefullStuding")
    private Integer UsefullStuding;

    @Column(name = "Placement")
    private Integer Placement;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssueYear() {
        return IssueYear;
    }

    public void setIssueYear(Integer issueYear) {
        IssueYear = issueYear;
    }

    public Integer getStartSelary() {
        return StartSelary;
    }

    public void setStartSelary(Integer startSelary) {
        StartSelary = startSelary;
    }

    public Integer getUsefullStuding() {
        return UsefullStuding;
    }

    public void setUsefullStuding(Integer usefullStuding) {
        UsefullStuding = usefullStuding;
    }

    public Integer getPlacement() {
        return Placement;
    }

    public void setPlacement(Integer placement) {
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
