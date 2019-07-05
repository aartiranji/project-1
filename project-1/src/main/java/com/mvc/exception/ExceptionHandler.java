package com.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

//	@org.springframework.web.bind.annotation.ExceptionHandler(value = GenericException.class)
//	public ResponseEntity<Object> exception(GenericException exception) {
//		return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
//	}

	// @ResponseBody
//    @org.springframework.web.bind.annotation.ExceptionHandler(value = GenericException.class)
//    public ResponseEntity<?> handleGenericException(GenericException exception) {
//        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
//        
//    }

//    @org.springframework.web.bind.annotation.ExceptionHandler(GenericException.class)
//    public void springHandleNotFound(HttpServletResponse response) throws IOException {
//        response.sendError(HttpStatus.NOT_FOUND.value());
//    }

	@org.springframework.web.bind.annotation.ExceptionHandler(value = GenericException.class)
	public ResponseEntity<?> handleGenericException(GenericException exception) {
		return new ResponseEntity<>(
				new ApiError(HttpStatus.EXPECTATION_FAILED.value(), exception.getMessage()),
				HttpStatus.EXPECTATION_FAILED);

	}

}
