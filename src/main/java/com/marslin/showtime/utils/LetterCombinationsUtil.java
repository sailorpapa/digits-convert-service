package com.marslin.showtime.utils;

import org.apache.commons.lang.StringUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LetterCombinationsUtil {

    public static ArrayList<String> store(int[] number, int len, String[] letters){

        ArrayList<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        while(!queue.isEmpty()){
            String s = queue.remove();

            //如果queue里拼接完的字符串元素长度与输入的number数组的长度相等，添加进list列表
            if (s.length() == len)
                list.add(s);
            else{
                int num = number[s.length()];
                if(num < letters.length) {
                    String val = letters[num];
                    if(StringUtils.isNotEmpty(val)) {
                        //迭代拼接字符串，存进queue字符串队列
                        for (int i = 0; i < val.length(); i++) {
                            queue.add(s + val.charAt(i));
                        }
                    }else {
                        System.out.println("0 or 1 do not map to any letters,please remove it!");
                    }
                }else{
                    System.out.println("the num you input {"+num+"} do not map to any letters,please input it again!");
                }
            }
        }
        return list;
    }
}
