package quiz.split.the.bill;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Transaction {
    private final String sender;
    private final String receiver;
    private final Double amount;
}
