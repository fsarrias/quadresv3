package com.exercicis.quadresv3.utilities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.FORBIDDEN, reason="El parametro introducido no existe.")
    public class NotFoundException extends Exception {

    public NotFoundException() {

    }

        public NotFoundException(String msg) {
            super(msg);
        }

    }
