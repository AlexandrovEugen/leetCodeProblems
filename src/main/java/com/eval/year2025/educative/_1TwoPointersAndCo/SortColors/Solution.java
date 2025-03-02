package com.eval.year2025.educative._1TwoPointersAndCo.SortColors;

class Solution {
    public void sortColors(int[] nums) {
        //Introduce three pointers that will act as a boundaries for the three colors of the array.
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        //Iterate through the array to process each element based on its value.
        while (white <= blue) {
            //If the current color corresponds to red(0), we swap the elements to move it to the red section at the start of the array.
            //The current color is placed at the end of the red section, and we then move to the next element.
            if (nums[white] == 0) {
                int temp = nums[red];
                nums[red] = nums[white];
                nums[white] = temp;
                white++;
                red++;
                //Else, if the current color corresponds to white(1), leave it in place and move to the next elem.
            } else if (nums[white] == 1) {
                white++;
            } else {
                //Otherwise, the current color corresponds to blue(2), we swap the elements to move them at the end of the array,
                // and the current color is placed at the start of the current section.
                int tmp = nums[blue];
                nums[blue] = nums[white];
                nums[white] = tmp;
                blue--;
            }
            //Continue the process above until all elements have been iterated.
        }
    }
}