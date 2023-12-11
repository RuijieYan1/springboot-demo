package com.example.springbootdemo;

import com.Service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    AccountService accountService;

    @Test
    void test() {
        accountService.updateAccount("林冲","宋江",1000);
    }

}
