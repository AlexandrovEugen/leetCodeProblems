package com.eval.easy.implementStackUsingQueues;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyStackTest {

    @Test
    void testThatStackWorksAsPlanned(){
        val myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);

        assertThat(myStack.top()).isEqualTo(2);
        assertThat(myStack.pop()).isEqualTo(2);
        assertThat(myStack.empty()).isFalse();
    }
    @Test
    void failedTestFromLeetCode(){
        val myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertThat(myStack.top()).isEqualTo(3);
    }
    @Test
    void anotherFailedTestFromLeetCode(){
        val myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(2);

        assertThat(myStack.top()).isEqualTo(2);
        assertThat(myStack.pop()).isEqualTo(2);
        assertThat(myStack.top()).isEqualTo(4);
    }
    @Test
    void andAnotherFailedTestFromLeetCode(){
        val myStack = new MyStack();
        myStack.push(1);

        assertThat(myStack.pop()).isEqualTo(1);
        assertThat(myStack.empty()).isTrue();
    }


}