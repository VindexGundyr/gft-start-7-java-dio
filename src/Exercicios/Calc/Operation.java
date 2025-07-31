package Exercicios.Calc;

import java.util.stream.LongStream;

public enum Operation {
    SUM(n -> LongStream.of(n).reduce(0, Long::sum), "+"),
    SUBTRACTION(n -> LongStream.of(n).reduce(0, (n1,n2) -> n1 - n2), "-");

    private final Calculate operationCallback;
    private final String signal;

    Operation(Calculate operationCallback, String signal) {
        this.operationCallback = operationCallback;
        this.signal = signal;
    }

    public Calculate getOperationCallback() {
        return operationCallback;
    }

    public String getSignal() {
        return signal;
    }
}
