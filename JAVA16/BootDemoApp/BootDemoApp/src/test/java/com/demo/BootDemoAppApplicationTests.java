package com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class BootDemoAppApplicationTests {

    private Calculator calculator = new Calculator();

    @Test
    void contextLoads() {

    }

    @Test
    void testSum(){

        int expectedResult = 133;
        int x = calculator.doSum(23,45,65);

        assertThat(x).isEqualTo(expectedResult);
    }

}

