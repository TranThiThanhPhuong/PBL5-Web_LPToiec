package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "part")
public class Part {

    @Id
    private long id; 
    
    @Column(name = "part_name", nullable = false, length = 50)
    private String partName;

    @OneToMany(mappedBy = "part", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reading> readings;

    @OneToMany(mappedBy = "part", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Listening> listenings;
    
    public Part() {
    }

    public Part(long id, String partName) {
        this.id = id;
        this.partName = partName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public List<Reading> getReadings() {
        return readings;
    }

    public void setReadings(List<Reading> readings) {
        this.readings = readings;
    }
    
    public List<Listening> getListenings() {
        return listenings;
    }

    public void setListenings(List<Listening> listenings) {
        this.listenings = listenings;
    }
}
