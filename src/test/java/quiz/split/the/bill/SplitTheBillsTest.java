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
    private static final String PETIA = "Petia";
    private final SplitTheBills splitTheBills = new SplitTheBills();

    @Test
    void makeBasicSettlementsFromExample() {
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

    @Test
    void dinnerPartySettlement() {
        // Given
        Set<Bill> bills = Stream.of(
                new Bill("Beers", IVAN, 12.0, payFor(IVAN, VANIA, SERGO, PETIA)),
                new Bill("Snooker", SERGO, 20.0, payFor(IVAN, VANIA, SERGO, PETIA)),
                new Bill("Movie tickets", IVAN, 12.0, payFor(IVAN, VANIA)),
                new Bill("Movie tickets", SERGO, 12.0, payFor(SERGO, PETIA)),
                new Bill("Wine", SERGO, 20.0, payFor(VANIA, PETIA)),
                new Bill("Whiskey", IVAN, 12.0, payFor(IVAN, SERGO)),
                new Bill("Dinner", SERGO, 16.0, payFor(SERGO, PETIA)),
                new Bill("Dinner", IVAN, 14.0, payFor(IVAN, VANIA)),
                new Bill("Baked pumpkin dessert", SERGO, 18.0, payFor(IVAN, VANIA, PETIA)),
                new Bill("One ball of ice-cream", IVAN, 2.5, payFor(SERGO)),
                new Bill("Taxi to Ivan's place", IVAN, 10.0, payFor(IVAN, VANIA)),
                new Bill("Taxi to Sergo's place", SERGO, 10.0, payFor(IVAN, VANIA))
        ).collect(Collectors.toSet());

        // When
        Set<Transaction> transactions = splitTheBills.makeSettlement(bills);

        // Then (because of emancipation women want to pay for themselves...)
        assertThat(transactions, hasSize(4)); // todo: figure out correct values
    }

    private Set<String> payFor(String... people) {
        return Stream.of(people).collect(Collectors.toSet());
    }
}