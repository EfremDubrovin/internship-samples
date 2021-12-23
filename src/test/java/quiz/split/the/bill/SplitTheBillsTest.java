package quiz.split.the.bill;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

class SplitTheBillsTest {

    private static final String IVAN = "Ivan";
    private static final String VANIA = "Vania";
    private static final String SERGO = "Sergo";
    private final SplitTheBills splitTheBills = new SplitTheBills();

    @Test
    void makeSettlements() {
        // Given
        Set<Bill> bills = Stream.of(
                new Bill("Beers", IVAN, 15.0, payFor(IVAN, VANIA, SERGO)),
                new Bill("Snooker", SERGO, 15.0, payFor(IVAN, VANIA, SERGO)),
                new Bill("Taxi", VANIA, 10.0, payFor(IVAN, VANIA))
        ).collect(Collectors.toSet());

        // When
        Set<Transaction> transactions = splitTheBills.makeSettlement(bills);

        // Then
        assertThat(transactions, hasSize(1));
        Transaction transaction = transactions.iterator().next();
        assertThat(transaction.getSender(), equalTo(VANIA));
        assertThat(transaction.getReceiver(), equalTo(SERGO));
        assertThat(transaction.getAmount(), equalTo(5.0));
    }

    private Set<String> payFor(String... people) {
        return Stream.of(people).collect(Collectors.toSet());
    }
}