package quiz.split.the.bill;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Person uniquely identified by his name
 */
@Getter
@RequiredArgsConstructor
@EqualsAndHashCode(of = "name")
public class Person {
    private final String name;
}
