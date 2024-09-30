package com.shanep.enumpkg;

public class ServiceResult {
    public static final String NOTEXIST = "NOT_EXIST";
    
    private boolean success;
    private String message;

    // Getters and Setters

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
