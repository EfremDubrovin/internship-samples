package quiz.split.the.bill;

import java.util.Collections;
import java.util.Set;

/**
 * Ivan, Sergo and Vania go to a bar after an exhausting day of production hotfixes @work.
 * Ivan buys beers for all of them for 15 leva.
 * After getting their beers, Sergo buys snooker tokens for 15 leva and all of them go to play snooker.
 * After they finish playing and drinking, they call it a night and go home.
 * Vania and Ivan will go together with a taxi and Vania will pay 10 leva for both.
 * Since they are good colleagues, they don't want to leave some colleague hanging with money and they want to settle the
 * payments.
 * Ivan needs to give Sergo 5 leva for pool, but it gets cancelled by Ivan buying him a drink.
 * The opposite is true for Sergo - no need to give Ivan 5 leva for the drink, because he paid for pool.
 * Vania needs to give 5 leva to Ivan and 5 leva to Sergo, but she will pay for Ivan's taxi (5leva).
 * That's why Vania only needs to give 5 levas to Sergo.
 * At the end of the night everyone is happy.
 * <p>
 * Given a set of Bills which have been paid for by different people
 * Create a settlement, which is a Set<@{@link Transaction}> in which the minimum possible amount of money
 * gets transferred between the involved people.
 */
public class SplitTheBills {

    public Set<Transaction> makeSettlement(Set<Bill> paidBills) {
        return Collections.emptySet();
    }
}
