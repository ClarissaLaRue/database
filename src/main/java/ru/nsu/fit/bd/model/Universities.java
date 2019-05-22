package ru.nsu.fit.bd.model;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.net.URL;

@Entity
@Table(name = "UNIVERSITY")
public class Universities implements Serializable, Entity {

    public Universities(String name, URL link) {
        this.name = name;
        this.link = link;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer UniversityId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Link")
    private URL link;

    public Integer getUniversityId(){
        return UniversityId;
    }

    public String getName() {
        return name;
    }

    public URL getLink() {
        return link;
    }

    public void setUniversityId(Integer universityId) {
        UniversityId = universityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(URL link) {
        this.link = link;
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
