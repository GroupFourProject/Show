package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ShowRestExceptionController {
@ExceptionHandler(DeleteShowException.class)
public ResponseEntity<?> handleDeleteException(DeleteShowException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(FindShowException.class)
public ResponseEntity<?> handleFindException(FindShowException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(UpdateShowException.class)
public ResponseEntity<?> handleUpdateException(UpdateShowException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(AddShowException.class)
public ResponseEntity<?> handleAddException(AddShowException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}

}
