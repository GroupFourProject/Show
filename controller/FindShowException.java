package com.controller;

public class FindShowException extends RuntimeException {
public FindShowException() {
	super("Show is not available");
}
@Override
public String toString() {
	return "Show is not available";

}
}
