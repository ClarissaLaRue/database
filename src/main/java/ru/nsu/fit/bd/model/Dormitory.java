package ru.nsu.fit.bd.model;

import javax.persistence.*;

@Entity
@Table(name = "DORMITORY")
public class Dormitory {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "State")
    private Integer State;

    @Column(name = "Shower")
    private Integer Shower;

    @Column(name = "Restroom")
    private Integer Restroom;

    @Column(name = "Kitchen")
    private Integer Kitchen;

    @Column(name = "PersonsCount")
    private Integer PersonsCount;

    @Column(name = "Price")
    private Integer Price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return State;
    }

    public void setState(Integer state) {
        State = state;
    }

    public Integer getShower() {
        return Shower;
    }

    public void setShower(Integer shower) {
        Shower = shower;
    }

    public Integer getRestroom() {
        return Restroom;
    }

    public void setRestroom(Integer restroom) {
        Restroom = restroom;
    }

    public Integer getKitchen() {
        return Kitchen;
    }

    public void setKitchen(Integer kitchen) {
        Kitchen = kitchen;
    }

    public Integer getPersonsCount() {
        return PersonsCount;
    }

    public void setPersonsCount(Integer personsCount) {
        PersonsCount = personsCount;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}
