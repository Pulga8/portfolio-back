package com.portfolioApp.SpringBoot.Service;

/**
 *
 * @author xortb
 */
public class NotFoundException extends Exception {

    private static final long serialVersionUID = 4881503605848878949L;

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
