package quiz.withdrawal;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Enum, holding all possible banknotes available for the {@link  Withdrawal} task
 */
@RequiredArgsConstructor
public enum BanknoteEnum {

    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    @Getter
    @NonNull
    private int value;
}
