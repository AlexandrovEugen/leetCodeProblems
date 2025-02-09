package com.eval.year2025.medium.puzzle2349;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class NumberContainersTest {


    /*
    Input["NumberContainers", "find", "change", "change", "change", "change", "find", "change", "find"]
         [[], [10], [2, 10], [1, 10], [3, 10], [5, 10], [10], [1, 20], [10]]
    Output [null, -1, null, null, null, null, 1, null, 2]

    Explanation
    NumberContainers nc = new NumberContainers();
    nc.find(10); // There is no index that is filled with number 10. Therefore, we return -1.
    nc.change(2, 10); // Your container at index 2 will be filled with number 10.
    nc.change(1, 10); // Your container at index 1 will be filled with number 10.
    nc.change(3, 10); // Your container at index 3 will be filled with number 10.
    nc.change(5, 10); // Your container at index 5 will be filled with number 10.
    nc.find(10); // Number 10 is at the indices 1, 2, 3, and 5. Since the smallest index that is filled with 10 is 1, we return 1.
    nc.change(1, 20); // Your container at index 1 will be filled with number 20. Note that index 1 was filled with 10 and then replaced with 20.
    nc.find(10); // Number 10 is at the indices 2, 3, and 5. The smallest index that is filled with 10 is 2. Therefore, we return 2.
     */
    @Test
    void example1() {
        final NumberContainers nc = new NumberContainers();

        assertThat(nc.find(10)).isEqualTo(-1);
        nc.change(2, 10);
        nc.change(1, 10);
        nc.change(3, 10);
        nc.change(5, 10);
        assertThat(nc.find(10)).isEqualTo(1);
        nc.change(1, 20);
        assertThat(nc.find(10)).isEqualTo(2);
    }

}