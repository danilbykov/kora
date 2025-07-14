package ru.tinkoff.kora.kafka.common.consumer;

public final class SkipRecordException extends RuntimeException {

    public SkipRecordException(Exception cause) {
        super(cause);
    }
}
