package com.umbrella.service.impl;

import com.umbrella.service.BusinessService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import java.sql.*;


@SpringBootTest
//@RunWith(SpringRunner.class)
public class BusinessServiceImplTest {

    @Before
    public void setUp() {
        // do nothing
    }

    @After
    public void tearDown() {
        // do nothing
    }

    @Autowired
    private BusinessService businessService;

    @Test
    public void hello() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://10.105.22.87:3306/erp_common?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "purchase_user", "purchase2016");
        ) {
            String sql = "SELECT * FROM `company`";
            PreparedStatement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");

            StopWatch watch = new StopWatch();
            watch.start();

            st = con.prepareStatement(sql);
            //设置参数
           /* st.setInt(1, 101);
            st.setInt(2, 0);*/
            //查询，得出结果集
            ResultSet rs = st.executeQuery();
            watch.stop();
            System.out.println(watch.getTotalTimeSeconds());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}