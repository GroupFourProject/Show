package com.controller;

public class DeleteShowException extends RuntimeException {
	private int id;
	public DeleteShowException(int id)
	{
		super("id "+id+" not found");
		this.id=id;
	}
	@Override
	public String toString() {
		return "id "+id+" not available";
	}
}
