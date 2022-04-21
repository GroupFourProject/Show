package com.controller;

import java.util.Arrays;

public class UpdateShowException extends RuntimeException {
public UpdateShowException() {
	super("Show is not available to update");
}

@Override
public String toString() {
	return "Show is not available to update";

}
}
