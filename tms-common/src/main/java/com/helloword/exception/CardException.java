package com.helloword.exception;

/**
 * Created by Administrator on 2017/12/14 0014.
 */
public class CardException extends RuntimeException {

    public CardException(){}

    public CardException(String message) {
        super(message);
    }

    public CardException(Throwable throwable) {
        super(throwable);
    }

    public CardException(Throwable throwable, String message) {

    }

}
