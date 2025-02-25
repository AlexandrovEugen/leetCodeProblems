package com.eval.year2025.medium.puzzle1261;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class FindElementsTest {

    private FindElements findElements;


    /*
    Input
    ["FindElements","find","find","find"]
     [[[-1,-1,-1,-1,-1]],[1],[3],[5]]

    Output [null,true,true,false]
    Explanation
    FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
    findElements.find(1); // return True
    findElements.find(3); // return True
    findElements.find(5); // return False
    */
    @Test
    void example1(){
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);

        findElements = new FindElements(root);

        assertThat(findElements.find(1)).isTrue();
        assertThat(findElements.find(3)).isTrue();
        assertThat(findElements.find(5)).isFalse();


    }

}