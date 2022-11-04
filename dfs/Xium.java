package dfs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Xium {

    public static void main(String[] args) {

    }

    public static void reverse(String str) {

        //String [] str1 = str.split("@");

    char str1 [] = str.toCharArray();
    int indexSpecial = 0;
    for(int i = 0; i < str1.length; i ++){
        if(str1[i] == '@') {
            indexSpecial = i;
            
        }
    }


    }
}
