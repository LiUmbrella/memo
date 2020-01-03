package demo;

/**
 * TODO
 *
 * @author lixiang
 * @since 2019年06月06日 14:25
 */
public class Test {
    public static void main(String[] args) {
        int countCPU = Runtime.getRuntime().availableProcessors();
        MyInvocationHandler handler = new MyInvocationHandler(new UserServiceImpl());
        UserService proxy = handler.getProxy();
        proxy.getName();
        proxy.sayHello();
    }
}
