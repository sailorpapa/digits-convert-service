package com.marslin.showtime.convertor;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ArrayList;

public class DigitsConvertor99 extends DigitsConvertor {

    public DigitsConvertor99(int[] number, int len) {
        super(number, len);
    }

    public void letterCombinationsZeroTo99(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(RandomStringUtils.randomAlphanumeric(3));
        }
        String[] letters = list.toArray(new String[list.size()]);
        doCombina(letters);
    }
}
