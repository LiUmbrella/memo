package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        //  Set<String> set = Collections.singleton("SingletonSet");
        // set.removeIf()
        //Collections.empty
        try {
            String str= "shipping quantity demand order\n dispatch bill" +
                    "\n\n" +
                    "\n organization\n" +
                    "\n";
            log.info("com.example.demo.DemoApplicationTests");
            Class<?> aClass = Class.forName("com.example.demo.DemoApplicationTests");
            Optional.ofNullable(aClass).filter(Class::isAnnotation).orElseGet(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
