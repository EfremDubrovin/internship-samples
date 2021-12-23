package quiz.withdrawal;

import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Holds the payments for a single withdrawal outcome possibility
 */
@EqualsAndHashCode
public class WithdrawalOutcome {

    private Map<BanknoteEnum, Integer> payments = new HashMap<>();

    public void addPaymentEntry(BanknoteEnum banknote, int quantity) {
        if (quantity <= 0) {
            throw new InvalidAmountOfBanknotesException("%d is an invalid number for banknote quantity");
        }

        payments.putIfAbsent(banknote, quantity);
    }

    public Map<BanknoteEnum, Integer> getPayments() {
        return Collections.unmodifiableMap(payments);
    }

    public void printPayments() {
        payments.forEach(this::printSinglePayment);
    }

    private void printSinglePayment(BanknoteEnum banknote, int quantity) {
        System.out.printf("- %s: %d\n", banknote, quantity);
    }
}
