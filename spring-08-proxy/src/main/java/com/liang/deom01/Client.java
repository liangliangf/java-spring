package com.liang.deom01;

//客户
public class Client implements Rent {

    private Host host;
    public Client(Host host) {
        this.host=host;
    }

    public void rent() {
        host.rent();
    }
}
