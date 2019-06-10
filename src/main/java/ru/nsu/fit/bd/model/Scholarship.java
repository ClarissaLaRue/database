package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "SHOLARSHIP")
public class Scholarship implements Serializable, Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Type")
    private String Type;

    @Column(name = "HowMuch")
    private Integer HowMuch;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getHowMuch() {
        return HowMuch;
    }

    public void setHowMuch(Integer howMuch) {
        HowMuch = howMuch;
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
