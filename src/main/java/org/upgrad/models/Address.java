package org.upgrad.models;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "flat_buil_number")
    private String flatbuildNumber;

    @Column(name = "locality")
    private String locality;

    @Column(name = "city")
    private String city;

    @Column(name = "zipcode")
    private String zipcode;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private States state;

    public Address() {
    }

    public Address(String flatbuildNumber, String locality, String city, String zipcode, States states) {
        this.flatbuildNumber = flatbuildNumber;
        this.locality = locality;
        this.city = city;
        this.zipcode = zipcode;
        this.state = states;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlatbuildNumber() {
        return flatbuildNumber;
    }

    public void setFlatbuildNumber(String flatbuildNumber) {
        this.flatbuildNumber = flatbuildNumber;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public States getStates() {
        return state;
    }

    public void setStates(States states) {
        this.state = states;
    }
}
