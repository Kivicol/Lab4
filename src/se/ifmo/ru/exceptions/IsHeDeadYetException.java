package se.ifmo.ru.exceptions;

import java.io.IOException;

public class IsHeDeadYetException extends IOException{
    public IsHeDeadYetException(String message) {
        super(message);
    }
}
