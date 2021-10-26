package project;

import java.time.LocalDate;

public class Note {

    private int id;
    private String context;
    private LocalDate date;

    public Note(int id, LocalDate date, String context) {
        this.id = id;
        this.date = date;
        this.context = context;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "id: " + id + ", date: " + date + ", context: " + context + ";";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Note note = (Note) obj;
        return this.id == note.id && this.context.equals(note.context) && this.date.equals(note.date);
    }

    @Override
    public int hashCode() {
        int hash = id+context.hashCode()+date.hashCode();
        return hash;
    }
}
