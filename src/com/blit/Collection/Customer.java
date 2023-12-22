package com.blit.Collection;

public class Customer implements Comparable<Customer> {
    private int id;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Customer o) {
        if(o.name.compareTo(this.name) < 0){
            return -1;
        } else if (o.name.compareTo(this.name) > 0) {
            return 1;

        }
        return 0;
    }

//    @Override
//    public int compareTo(Customer o) {
//        return this.id - o.getId();
//    }

}
