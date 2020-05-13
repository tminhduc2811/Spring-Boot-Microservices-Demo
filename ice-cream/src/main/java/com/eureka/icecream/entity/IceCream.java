package com.eureka.icecream.entity;

import javax.persistence.*;

@Entity
@Table(name = "icecream")
public class IceCream {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IceCream(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public IceCream() {

    }
}
