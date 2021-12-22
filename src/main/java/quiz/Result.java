package quiz;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Result {
    private final Integer maximumSubArraySum;
    private final Integer maximumSubSetSum;
}
