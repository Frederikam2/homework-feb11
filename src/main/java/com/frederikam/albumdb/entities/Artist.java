package com.frederikam.albumdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "artist")
public class Artist {

    public Artist() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title")
    private String name;

    @Column(name = "year")
    private short year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }
}
