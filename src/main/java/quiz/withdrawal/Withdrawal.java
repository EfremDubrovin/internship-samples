package quiz.withdrawal;

import java.util.Collections;
import java.util.List;

/**
 * Given an amount of money to be paid and the banknotes ({@link BanknoteEnum})
 * available to pay with, with an infinite supply of every banknote,
 * print all possible ways by which the amount can be paid.
 *
 * Example:
 *      INPUT:
 *          amount = 5
 *      OUTPUT:
 *          Available bills to pay with: ONE, TWO, FIVE
 *          Possible outcomes - 4:
 *          - ONE: 5
 *          - ONE: 3, TWO: 1
 *          - ONE: 1, TWO: 2
 *          - FIVE: 1
 *
 * !Note: the order, in which you would print the outcomes, is irrelevant.
 */
public class Withdrawal {

    public void printWithdrawalOutcomes(int amount) {
        printOutcomes(calculateOutcomes(amount));
    }

    List<WithdrawalOutcome> calculateOutcomes(int amountToBePaid) {
        //TODO: Write your solution here.
        return Collections.emptyList();
    }

    private void printOutcomes(List<WithdrawalOutcome> outcomes) {
        if (outcomes.isEmpty()) {
            System.out.println("No possible withdrawals? :(");
        }

        System.out.println("Possible outcomes - " + outcomes.size());
        outcomes.forEach(WithdrawalOutcome::printPayments);
    }
}
