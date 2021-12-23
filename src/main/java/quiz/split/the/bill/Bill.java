package quiz.split.the.bill;

import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class Bill {
    private final String name;
    private final String paidBy;
    private final Double amount;
    private final Set<String> paidForPeople;
}
