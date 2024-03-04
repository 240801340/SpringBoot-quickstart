package com.example.springbootquickstart.pojo;

import org.springframework.web.bind.annotation.RestController;


public class User {
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String age;
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
