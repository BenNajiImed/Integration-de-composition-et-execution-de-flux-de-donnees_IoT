package com.dravassor.events;

public enum EventType {
    CREATION("CREATION"), UPDATE("UPDATE"), DELETION("DELETION"), STARTUP("STARTUP"), STOP("STOP");

    private final String text;

	private EventType(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
    
}
