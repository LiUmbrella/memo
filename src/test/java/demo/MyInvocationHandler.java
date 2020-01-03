package demo;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author lixiang
 * @since 2019年06月06日 14:16
 */
@Data
public class MyInvocationHandler implements InvocationHandler {

    private UserService obj;

    public MyInvocationHandler(UserService obj) {
        this.obj = obj;
    }

    public UserService getProxy() {
        return (UserService) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object invoke = method.invoke(obj, args);
        System.out.println(invoke);
        System.out.println("after");
        return invoke;
    }
}
