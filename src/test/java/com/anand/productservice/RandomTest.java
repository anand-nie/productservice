package com.anand.productservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RandomTest {

    /*
     * AAA
     * Arrange
     * Act
     * Assert
     *
     * */

    @Test
    void testOnePlusISOne(){

        int i = 1 + 1;

        assert i == 2;
        assert i*i == 4;

        Assertions.assertTrue( i == 2);
        Assertions.assertEquals(i,2);
        Assertions.assertFalse(i == 3);
        int [] list = {1, 2, 3, 4,7};
        int [] list1 = {1, 2, 3, 4,7};
        Assertions.assertArrayEquals(list,list1);

    }
}
