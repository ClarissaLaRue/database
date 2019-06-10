package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "DORMITORY")
public class Dormitory implements Serializable, Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "State")
    private Float State;

    @Column(name = "Shower")
    private Float Shower;

    @Column(name = "Restroom")
    private Float Restroom;

    @Column(name = "Kitchen")
    private Float Kitchen;

    @Column(name = "PersonsCount")
    private Float PersonsCount;

    @Column(name = "Price")
    private Float Price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getState() {
        return State;
    }

    public void setState(Float state) {
        State = state;
    }

    public Float getShower() {
        return Shower;
    }

    public void setShower(Float shower) {
        Shower = shower;
    }

    public Float getRestroom() {
        return Restroom;
    }

    public void setRestroom(Float restroom) {
        Restroom = restroom;
    }

    public Float getKitchen() {
        return Kitchen;
    }

    public void setKitchen(Float kitchen) {
        Kitchen = kitchen;
    }

    public Float getPersonsCount() {
        return PersonsCount;
    }

    public void setPersonsCount(Float personsCount) {
        PersonsCount = personsCount;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
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
