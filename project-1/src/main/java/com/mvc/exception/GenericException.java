package com.mvc.exception;

public class GenericException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public GenericException(String msg) {
		//this.msg = msg;
		super(msg);
	}
	
	public String getMsg() {
        return msg;
    }

}
