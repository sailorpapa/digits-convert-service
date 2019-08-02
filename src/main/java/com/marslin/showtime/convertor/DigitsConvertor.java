package com.marslin.showtime.convertor;

import com.marslin.showtime.utils.LetterCombinationsUtil;

import java.util.ArrayList;

public class DigitsConvertor {

    private int[] number;
    private int len;

    public DigitsConvertor(int[] number, int len) {
        this.number = number;
        this.len = len;
    }

    public void letterCombinationsZeroToNine(){

        String[] letters = { "", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz" };
        doCombina(letters);
    }

    public void doCombina(String[] letters) {
        ArrayList<String> list = LetterCombinationsUtil.store(number, len, letters);
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

}
