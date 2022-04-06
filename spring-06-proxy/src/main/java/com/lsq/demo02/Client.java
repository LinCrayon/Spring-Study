package com.lsq.demo02;

/**
 * @author linshengqian
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy(userService);

        proxy.add();
        proxy.update();
        proxy.delete();
        proxy.select();
    }
}
