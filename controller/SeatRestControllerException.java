package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class SeatRestControllerException {
@ExceptionHandler(DeleteSeatException.class)
public ResponseEntity<?> handleDeleteException(DeleteSeatException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(UpdateSeatException.class)
public ResponseEntity<?> handleUpdateException(UpdateSeatException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(FindSeatException.class)
public ResponseEntity<?> handleFindException(FindSeatException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(AddSeatException.class)
public ResponseEntity<?> handleAddException(AddSeatException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(BookSeatException.class)
public ResponseEntity<?> handleBookException(BookSeatException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(CancelSeatException.class)
public ResponseEntity<?> handleCancelException(CancelSeatException e,WebRequest req)
{
	return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
}
}
