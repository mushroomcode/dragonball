package com.impl;

public class UserInStart {
    public void test () {
        UserImpl userImpl = new UserImpl();
        userImpl.apply(() -> System.out.println(""));
    }
}
