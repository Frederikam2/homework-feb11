package com.frederikam.albumdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "production")
public class ProductionInfo {

    public ProductionInfo() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "production_id", nullable = false)
    private int id;

    @Column(name = "producer")
    private String producer;

    @Column(name = "label")
    private String label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "ProductionInfo{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
