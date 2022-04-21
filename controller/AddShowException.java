package com.controller;

public class AddShowException extends RuntimeException {

public AddShowException()

{
	super("Show is not available to add");
			}
@Override
public String toString() {
	return"Show is not available to add";

}

}
