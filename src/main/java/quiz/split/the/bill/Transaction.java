package quiz.split.the.bill;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Transaction {
    private final Person sender;
    private final Person receiver;
    private final Double amount;
}
