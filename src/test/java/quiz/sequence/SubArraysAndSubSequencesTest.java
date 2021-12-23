package quiz.sequence;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class SubArraysAndSubSequencesTest {

    private final SubArraysAndSubSequences subArraysAndSubSequences = new SubArraysAndSubSequences();

    @Test
    void testSums() {
        // sub-array with biggest sum is 1,2,3
        // subset with biggest sum is 1,2,3
        assertSums(new Integer[]{1, 2, 3}, 6, 6);
        // sub-array with biggest sum is just 3
        // subset with biggest sum is 1,3
        assertSums(new Integer[]{1, -2, 3}, 3, 4);
        // sub-array with biggest sum is just 2,3,-1,2
        // subset with biggest sum is 1,2,3,2
        assertSums(new Integer[]{1, -2, 2, 3, -1, 2}, 6, 8);
        // sub-array with biggest sum is -1
        // subset with biggest sum is -1
        assertSums(new Integer[]{-2, -3, -1, -4, -6}, -1, -1);
    }

    private void assertSums(Integer[] inputArray, int expectedSubArraySum, int expectedSubsetSum) {
        // Given
        Integer[] superset = inputArray;

        // When
        Result result = subArraysAndSubSequences.calculate(superset);

        // Then
        assertThat(result.getMaximumSubArraySum(), equalTo(expectedSubArraySum));
        assertThat(result.getMaximumSubSetSum(), equalTo(expectedSubsetSum));
    }
}