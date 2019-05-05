package com.imooc.utils;

import java.util.Random;

public class KeyUtil {
    //时间 + 随机数
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer num = random.nextInt(9000000) +  1000000;

        return System.currentTimeMillis() + String.valueOf(num);
    }
}
