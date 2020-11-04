package com.liang.deom01;

//中介
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host){
        this.host=host;
    }

    public void rent() {
        SeeHouse();
        host.rent();
        fare();
        hetong();
    }

    public void SeeHouse(){
        System.out.println("中介带你看房子");
    }
    public void fare(){
        System.out.println("中介收中介费");
    }
    public void hetong(){
        System.out.println("签合同");
    }
}
