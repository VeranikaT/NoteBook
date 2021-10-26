package project;

public class NoteBookConsoleView {
    public void print (Note note) {
        System.out.println(note.toString());
    }

    public void print (Note ... notes) {
        for(int i = 0; i < notes.length; i++) {
            Note note = notes[i];
            System.out.println(note.toString());
        }
    }

    public void print(NoteBook noteBook) {
        System.out.println(noteBook);
    }
}
