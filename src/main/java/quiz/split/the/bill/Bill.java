package quiz.split.the.bill;

import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class Bill {
    private final Person paidBy;
    private final Double amount;
    private final Set<Person> paidForPeople;
}
