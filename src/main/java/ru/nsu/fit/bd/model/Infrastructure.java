package ru.nsu.fit.bd.model;

import javax.persistence.*;

@Entity
@Table(name = "INFRASTRUCTURE")
public class Infrastructure {
    @javax.persistence.Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

    @Column(name = "CafeFood")
    private String CafeFood;

    @Column(name = "CafePrice")
    private String CafePrice;

    @Column(name = "CafeService")
    private String CafeService;

    @Column(name = "Cinema")
    private String Cinema;

    @Column(name = "ShoppingCenter")
    private String ShoppingCenter;

    @Column(name = "Underground")
    private String Underground;

    @Column(name = "BusStops")
    private String BusStops;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCafeFood() {
        return CafeFood;
    }

    public void setCafeFood(String cafeFood) {
        CafeFood = cafeFood;
    }

    public String getCafePrice() {
        return CafePrice;
    }

    public void setCafePrice(String cafePrice) {
        CafePrice = cafePrice;
    }

    public String getCafeService() {
        return CafeService;
    }

    public void setCafeService(String cafeService) {
        CafeService = cafeService;
    }

    public String getCinema() {
        return Cinema;
    }

    public void setCinema(String cinema) {
        Cinema = cinema;
    }

    public String getShoppingCenter() {
        return ShoppingCenter;
    }

    public void setShoppingCenter(String shoppingCenter) {
        ShoppingCenter = shoppingCenter;
    }

    public String getUnderground() {
        return Underground;
    }

    public void setUnderground(String underground) {
        Underground = underground;
    }

    public String getBusStops() {
        return BusStops;
    }

    public void setBusStops(String busStops) {
        BusStops = busStops;
    }
}
