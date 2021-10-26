package project;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Command {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to create a new NoteBook?(choose true/false)");
        boolean answer = sc.hasNext();

        Scanner sc_name = new Scanner(System.in);
        System.out.println("Who is the holder of this NoteBook?");
        String holder_name = sc_name.nextLine();

        if(answer == true){
            NoteBookProvider nbp = NoteBookProvider.getInstance();
            NoteBook nb_holder = nbp.getNoteBook();
            System.out.println("NoteBook for " + holder_name + ": "+nb_holder);
       }

        NoteBookProvider nbp = NoteBookProvider.getInstance();
        NoteBook nb_holder = nbp.getNoteBook();

        LocalDate date = LocalDate.now();

        Note note1 = new Note(1, date, "Run");
        Note note2 = new Note(2, date, "Eat");
        Note note3 = new Note(3, date, "Work");
        Note note4 = new Note(3, date, "Sleep");


        nb_holder.add(note1);
        nb_holder.add(note2);
        nb_holder.add(note3);
        nb_holder.add(note4);

        Scanner sc_context = new Scanner(System.in);
        System.out.println("Find note by context:");
        String cntxt = sc_context.nextLine();
        System.out.println(nb_holder.findByContext(cntxt));

        Scanner sc_date = new Scanner(System.in);
        System.out.println("Find note by date, please, fill in according to type: yyyy-mm-dd");
        String dt = sc_date.nextLine();
        LocalDate localDate = LocalDate.parse(dt);

        System.out.println(nb_holder.findByDate(localDate));
    }
}
