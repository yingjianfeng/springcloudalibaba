package com.yjf.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Title: Test
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/10/15 11:03
 */
public class Test {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy:MM:dd");
        String s = format.format(new Date());
        String replace = s.replace(":", "%3A");
        System.out.println(replace);
        System.out.println(s);

    }
}
