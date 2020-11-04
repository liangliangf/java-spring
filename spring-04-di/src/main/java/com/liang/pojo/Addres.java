package com.liang.pojo;

public class Addres {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    @Override
    public String toString() {
        return "Addres{" +
                "address='" + address + '\'' +
                '}';
    }
}
