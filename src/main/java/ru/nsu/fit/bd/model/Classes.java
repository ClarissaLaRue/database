package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CLASSES")
public class Classes implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

    @Column(name = "Profile")
    private Integer Profile;

    @Column(name = "NonProfile")
    private Integer NonProfile;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getProfile() {
        return Profile;
    }

    public void setProfile(Integer profile) {
        Profile = profile;
    }

    public Integer getNonProfile() {
        return NonProfile;
    }

    public void setNonProfile(Integer nonProfile) {
        NonProfile = nonProfile;
    }
}
