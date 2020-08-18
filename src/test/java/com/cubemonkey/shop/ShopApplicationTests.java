package com.cubemonkey.shop;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.cubemonkey.shop.dao")
class ShopApplicationTests {

    @Test
    void contextLoads() {
    }

}
