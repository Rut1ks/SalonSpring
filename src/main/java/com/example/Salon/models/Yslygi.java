package com.example.Salon.models;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Collection;

@Entity
public class Yslygi {
    @Id
    @GeneratedValue
    private Long id;
    private String nameYslygi;
    private Integer costYslygi;
    private String timeOfEvent;

    @ManyToOne(optional = true,cascade = CascadeType.DETACH)
    private TipYslygi tipYslygi;
    @ManyToOne(optional = true,cascade = CascadeType.DETACH)
    private Nabori nabori;
    @OneToMany(mappedBy = "Yslygi",fetch = FetchType.EAGER)
    private Collection<Zapisi> zapisiCollection;

    public Yslygi() {
    }

    public Yslygi(String nameYslygi, Integer costYslygi, String timeOfEvent) {
        this.nameYslygi = nameYslygi;
        this.costYslygi = costYslygi;
        this.timeOfEvent = timeOfEvent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameYslygi() {
        return nameYslygi;
    }

    public void setNameYslygi(String nameYslygi) {
        this.nameYslygi = nameYslygi;
    }

    public Integer getCostYslygi() {
        return costYslygi;
    }

    public void setCostYslygi(Integer costYslygi) {
        this.costYslygi = costYslygi;
    }

    public String getTimeOfEvent() {
        return timeOfEvent;
    }

    public void setTimeOfEvent(String timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }

    public TipYslygi getTipYslygi() {
        return tipYslygi;
    }

    public void setTipYslygi(TipYslygi tipYslygi) {
        this.tipYslygi = tipYslygi;
    }

    public Nabori getNabori() {
        return nabori;
    }

    public void setNabori(Nabori nabori) {
        this.nabori = nabori;
    }

    public Collection<Zapisi> getZapisiCollection() {
        return zapisiCollection;
    }

    public void setZapisiCollection(Collection<Zapisi> zapisiCollection) {
        this.zapisiCollection = zapisiCollection;
    }
}
