package com.lsq.demo01;

/**
 * @author linshengqian
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    public void fare(){
        System.out.println("收中介费");
    }

}
