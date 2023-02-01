package com.dravassor.events;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Event {

    protected UUID id;
    protected EventType eventType;
    protected Date date = Calendar.getInstance().getTime();

    public Event() {
        super();
    }

    public Event(EventType eventType) {
        this.eventType = eventType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "date=" + date + ", eventType=" + eventType + ", id=" + id;
    }

    
}
