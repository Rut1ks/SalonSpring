package com.example.Salon.models;


import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Collection;

@Entity
public class Doljnosti {
    @Id
    @GeneratedValue
    private Long id;
    private String namePost;
    private Integer postPrice;

    @OneToMany(mappedBy = "Doljnost",fetch = FetchType.EAGER)
    private Collection<Sotrydniki> sotrydnikiCollection;

    public Doljnosti() {
    }

    public Doljnosti(String namePost, Integer postPrice) {
        this.namePost = namePost;
        this.postPrice = postPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public Integer getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(Integer postPrice) {
        this.postPrice = postPrice;
    }

    public Collection<Sotrydniki> getSotrydnikiCollection() {
        return sotrydnikiCollection;
    }

    public void setSotrydnikiCollection(Collection<Sotrydniki> sotrydnikiCollection) {
        this.sotrydnikiCollection = sotrydnikiCollection;
    }
}
