package com.example.objectbox.entities;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Generated;
import io.objectbox.annotation.apihint.Internal;

@Entity
public class Customer {

    @Id
    Long id;

    String name;

    @Generated(265665000)
    @Internal
    /** This constructor was generated by ObjectBox and may change any time. */
    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(60841032)
    public Customer() {
    }

}