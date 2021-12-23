package quiz.withdrawal;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.singletonMap;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static quiz.withdrawal.BanknoteEnum.*;

public class WithdrawalTest {

    private final Withdrawal withdrawal = new Withdrawal();

    @Test
    public void test_withdrawalOutcomeIsCorrect() {
        // Given
        int amountToWithdraw = 5;

        // When
        List<WithdrawalOutcome> outcomes = withdrawal.calculateOutcomes(amountToWithdraw);

        // Then
        assertThat(outcomes, hasSize(4));
        assertThat(outcomes, allOf(
                contains(createWithdrawalOutcome(singletonMap(ONE, 5))),
                contains(createWithdrawalOutcome(
                        new HashMap<BanknoteEnum, Integer>() {{
                            put(ONE, 3);
                            put(TWO, 1);
                        }}
                )),
                contains(createWithdrawalOutcome(
                        new HashMap<BanknoteEnum, Integer>() {{
                            put(ONE, 1);
                            put(TWO, 2);
                        }}
                )),
                contains(createWithdrawalOutcome(singletonMap(FIVE, 1))))
        );
    }

    private WithdrawalOutcome createWithdrawalOutcome(Map<BanknoteEnum, Integer> payments) {
        WithdrawalOutcome withdrawalOutcome = new WithdrawalOutcome();
        payments.forEach(withdrawalOutcome::addPaymentEntry);
        return withdrawalOutcome;
    }
}
