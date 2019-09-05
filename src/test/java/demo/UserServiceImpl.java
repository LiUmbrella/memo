package demo;

/**
 * TODO
 *
 * @author lixiang
 * @since 2019年06月06日 14:14
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "令狐冲";
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
