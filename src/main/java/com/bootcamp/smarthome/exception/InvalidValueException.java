package com.bootcamp.smarthome.exception;

public class InvalidValueException extends HomeAutomationException {
    public InvalidValueException(String field, Object value, String constraint) {
        super(String.format("Invalid value for %s: %s %s", field, value, constraint));
    }
}