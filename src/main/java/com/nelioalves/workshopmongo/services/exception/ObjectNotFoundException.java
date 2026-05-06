package com.nelioalves.workshopmongo.services.exception;

import java.io.Serial;

public class ObjectNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 4863555269931926091L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
