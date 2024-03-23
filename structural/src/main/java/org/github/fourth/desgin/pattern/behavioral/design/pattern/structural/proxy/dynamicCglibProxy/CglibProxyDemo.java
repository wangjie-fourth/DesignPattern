package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.proxy.dynamicCglibProxy;


import org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.proxy.staticProxy.UserService;
import org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.proxy.staticProxy.UserServiceImpl;

public class CglibProxyDemo {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(userService);
        UserService proxyInstance = (UserService) proxyFactory.getProxyInstance();
        proxyInstance.sayHello();

    }
}
