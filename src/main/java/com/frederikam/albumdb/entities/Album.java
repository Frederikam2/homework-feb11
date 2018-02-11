package com.frederikam.albumdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "album")
public class Album {

    public Album() {}

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "year")
    private short year;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "id")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "id")
    private ProductionInfo production;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public ProductionInfo getProduction() {
        return production;
    }

    public void setProduction(ProductionInfo production) {
        this.production = production;
    }
}
