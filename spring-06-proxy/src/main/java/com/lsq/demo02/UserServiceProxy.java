package com.lsq.demo02;

/**
 * @author linshengqian
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
    log("upadte");
    userService.update();
    }

    @Override
    public void select() {
        log("select");
        userService.select();
    }
    public void log(String msg){
        System.out.println("执行了" + msg + "方法");
    }
}
