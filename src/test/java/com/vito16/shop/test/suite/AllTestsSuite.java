/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-10-30 15:59 创建
 */
package com.vito16.shop.test.suite;

import com.vito16.shop.test.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015/10/30
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AdminTest.class,
        OrderTest.class,
        UserTest.class,
        ProductTest.class,
        RegTest.class})
public class AllTestsSuite {

}
