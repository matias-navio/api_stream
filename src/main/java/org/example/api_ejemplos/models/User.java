package org.example.api_ejemplos.models;

public class User {

    private String name;
    private String lastname;
    private Integer id;
    private static int lastId;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.id = ++lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + ' ' + lastname;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
