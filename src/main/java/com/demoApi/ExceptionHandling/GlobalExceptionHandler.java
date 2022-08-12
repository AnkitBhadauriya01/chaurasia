package com.demoApi.ExceptionHandling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demoApi.Payloads.ApiResponse;



@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ClassNotFoundException.class)
	public ResponseEntity<ApiResponse>ResourceNotFoundhandler (ResourceNotFoundException ex){
		String message = ex.getResourceName();
		ApiResponse apiResponse = new ApiResponse();
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}
		
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<Map<String, String>> handleMethodArgsNotVaildException(MethodArgumentNotValidException ex)
		{
			Map<String, String> resp = new HashMap<>();
			ex.getBindingResult().getAllErrors().forEach((error)->{
				String fieldName = "hello";
				String message = error.getDefaultMessage();
				resp.put(fieldName, message);
			});
			
			return new ResponseEntity<Map<String, String>>(resp,HttpStatus.BAD_REQUEST);
		}
}