package com.hcl.capstoneserver.invoice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvoiceOwnershipException extends HttpClientErrorException {
    private final String FIELD = "User Id";

    public InvoiceOwnershipException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }

    public String getField() {
        return FIELD;
    }
}
