package com.jjh.set;

public class SetException extends RuntimeException {
    private int code;

    public SetException(String cause, int code) {
        super(cause);
        this.code = code;
    }

    public SetException(String cause, int code, Exception exp) {
        super(cause, exp);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
