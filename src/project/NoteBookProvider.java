package project;

public class NoteBookProvider{
    private static NoteBookProvider instance;
    private NoteBook noteBook;

    public NoteBook getNoteBook() {
        return noteBook;
    }

    private NoteBookProvider() {

        this.noteBook = new NoteBook();
    }

    public static NoteBookProvider getInstance() {
        if(instance == null) {
            instance = new NoteBookProvider();
        }
        return instance;
    }

}
