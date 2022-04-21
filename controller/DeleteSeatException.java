package com.controller;

public class DeleteSeatException extends RuntimeException {
	private int id;
	public DeleteSeatException(int id)
	{
		super("id "+id+" not found");
		this.id=id;
	}
	@Override
	public String toString() {
		return "id "+id+" not available";
	}
}
