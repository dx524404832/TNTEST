package com.huawei.mw;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2017/2/10.
 */
public class MyClassTest extends TestCase {

    MyClass insta ;
    @Before
    public void setUp() throws Exception {
        insta = new MyClass();
    }

    @Test
    public void testsayHello() throws Exception {
        assertEquals("hello!",insta.sayHello());
    }

}