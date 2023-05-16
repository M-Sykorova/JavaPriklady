package sk.macuska.project.course.oop.knihy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NazvyKnih {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> bookNames = new ArrayList<>();

        System.out.println("Zadavajte zoznam knih a tento zoznam ukoncite slovom: koniec");
        String name = scanner.next();


        while(!name.equals("koniec")){
            bookNames.add(name);
            name = scanner.next();
        }

        System.out.println("Vysledny zoznam knih: ");
        for(String s: bookNames){
            System.out.print(s + " ");
        }
    }
}
