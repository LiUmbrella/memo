package com.umbrella.service.impl;

import com.umbrella.service.BusinessService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author lixiang
 * @since 2019/5/23 17:34
 */
@Service
public class BusinessServiceImpl implements BusinessService {
    @Override
    public String hello() {
        int a = 0 / 1;
        return "hello";
    }
}
