package quiz;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SingleWordAnagramCheckerTest {

    private final SingleWordAnagramChecker singleWordAnagramChecker = new SingleWordAnagramChecker();

    @Test
    public void test_anagramReturnsTrue() {
        // Given
        String word = "Hamlet";
        String anagram = "Amleth";

        // When
        boolean result = singleWordAnagramChecker.isAnagram(word, anagram);

        // Then
        assertThat(result, is(true));
    }

    @Test
    public void test_anotherAnagramReturnsTrue() {
        // Given
        String word = "Fried";
        String anagram = "fired";

        // When
        boolean result = singleWordAnagramChecker.isAnagram(word, anagram);

        // Then
        assertThat(result, is(true));
    }

    @Test
    public void test_notAnAnagramReturnsFalse() {
        // Given
        String word = "knee";
        String anagram = "keep";

        // When
        boolean result = singleWordAnagramChecker.isAnagram(word, anagram);

        // Then
        assertThat(result, is(false));
    }

    @Test
    public void test_anotherNotAnAnagramReturnsFalse() {
        // Given
        String word = "Listen";
        String anagram = "Silence";

        // When
        boolean result = singleWordAnagramChecker.isAnagram(word, anagram);

        // Then
        assertThat(result, is(false));
    }
}
