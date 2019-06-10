package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;

@Entity
@Table(name = "CLASSES")
public class Classes implements Serializable, Entity {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

    @Column(name = "UniversityID")
    private Integer UniversityId;

    @Column(name = "Profile")
    private Float Profile;

    @Column(name = "NonProfile")
    private Float NonProfile;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Float getProfile() {
        return Profile;
    }

    public void setProfile(Float profile) {
        Profile = profile;
    }

    public Float getNonProfile() {
        return NonProfile;
    }

    public void setNonProfile(Float nonProfile) {
        NonProfile = nonProfile;
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
