package com.planificateur.eventplanner.models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * FullCallendar compatible model
 */
public class Event {
    private Long id; // Matches Reservaciones folioReservacion
    private Timestamp start;
    private Timestamp end;
    private String title;
    private String url;
    private boolean editable = false;

    public Event(){

    }

    public Event(Reservacion r){
        this.id = r.getFolioReservacion();
        this.start = r.getHoraInicio();
        this.end = r.getHoraFin();
        this.title = "#" + this.id;
        this.url = "/reservaciones/" + this.id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isEditable() {
        return editable;
    }

    public static List<Event> eventifyBatch(List<Reservacion> reservaciones){
        List<Event> events = new ArrayList<>();
        for(Reservacion r: reservaciones){
            events.add(new Event(r));
        }

        return events;
    }
}
