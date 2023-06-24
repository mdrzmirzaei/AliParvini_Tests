package ORM_Test;

import javax.persistence.*;


public class Customer {

    int id;


    String name;

    String family;

    String address;


    public Customer() {
    }

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(int id, String name, String family, String address) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.address = address;
    }
}


