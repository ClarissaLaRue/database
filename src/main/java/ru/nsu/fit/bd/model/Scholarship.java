package ru.nsu.fit.bd.model;

import javax.persistence.*;

@Entity
@Table(name = "SHOLARSHIP")
public class Scholarship {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

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
}
