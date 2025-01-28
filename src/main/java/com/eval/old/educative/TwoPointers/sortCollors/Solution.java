package com.eval.old.educative.TwoPointers.sortCollors;

public class Solution {

    public static int[] sortColors (int[] colors) {

        int red = 0;
        int white = 0;
        int blue = colors.length - 1;

        while(white <= blue){
            int tmp = -1;
            if(colors[white] == 0){
                tmp = colors[red];
                colors[red] = colors[white];
                colors[white] = tmp;
                red++;
                white++;
            }else if(colors[white] == 1){
                white++;
            }else{
                colors[blue] = tmp;
                colors[blue] = colors[white];
                colors[white] = tmp;
                blue--;
            }
        }


        // Replace this placeholder return statement with your code

        return colors;
    }
}
