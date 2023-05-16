package sk.macuska.project.course.swing;

import sk.macuska.project.course.opakovanie.kniha.model.Kniha;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KniznicaApp {
    public static void main(String[] args) {

        ArrayList<Kniha> library = new ArrayList<>();

        library.add(new Kniha("Harry Potter", "J.K.Rowlingova", 2000));
        library.add(new Kniha("Ja, Robot", "Isaac Asimov", 1950));


        //FRAME
        JFrame frame = new JFrame("Kniznica App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(580,600));

        //PANEL
        JPanel panelBook = new JPanel();
        panelBook.setLayout(null);

        frame.setContentPane(panelBook);

        //NAZOV KNIHY
        JLabel bookNameLabel = new JLabel("Nazov knihy");
        bookNameLabel.setBounds(20, 20, 100, 20);
        panelBook.add(bookNameLabel);

        JTextField bookNameTF = new JTextField();
        bookNameTF.setBounds(140, 20, 400, 20);
        bookNameTF.setHorizontalAlignment(JTextField.RIGHT);
        panelBook.add(bookNameTF);

        //AUTOR KNIHY
        JLabel bookAuthorLabel = new JLabel("Autor knihy");
        bookAuthorLabel.setBounds(20, 60, 100, 20);
        panelBook.add(bookAuthorLabel);

        JTextField bookAuthorTF = new JTextField();
        bookAuthorTF.setBounds(140, 60, 400, 20);
        bookAuthorTF.setHorizontalAlignment(JTextField.RIGHT);
        panelBook.add(bookAuthorTF);

        //ROK VYDANIA
        JLabel bookPublishYear = new JLabel("Rok vydania");
        bookPublishYear.setBounds(20, 100, 100, 20);
        panelBook.add(bookPublishYear);

        JTextField bookPublishYearTF = new JTextField();
        bookPublishYearTF.setBounds(140, 100, 400, 20);
        bookPublishYearTF.setHorizontalAlignment(JTextField.RIGHT);
        panelBook.add(bookPublishYearTF);

        //VYHLADAVANIE
        JLabel searchLabel = new JLabel("Vyhladaj");
        searchLabel.setBounds(20, 180, 100, 20);
        panelBook.add(searchLabel);

        JTextField searchTF = new JTextField();
        searchTF.setBounds(140, 180, 200, 20);
        searchTF.setHorizontalAlignment(JTextField.RIGHT);
        panelBook.add(searchTF);

        //ZOZNAM KNIH
        JLabel books = new JLabel("Zoznam knih");
        books.setBounds(20, 210, 100, 20);
        panelBook.add(books);

        JTextArea booksList = new JTextArea(printBooks(library));
        booksList.setBounds(20, 250, 500, 200);
        panelBook.add(booksList);

        //NASTAVENIE VYHLADAVANIA PODLA KEYWORDU
        searchTF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
               booksList.setText(printBooks(searchForBook(library, searchTF.getText())));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                booksList.setText(printBooks(searchForBook(library, searchTF.getText())));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                booksList.setText(printBooks(searchForBook(library, searchTF.getText())));
            }
        });


        //BUTTON PRIDAJ
        JButton btnAdd = new JButton("Pridaj knihu");
        btnAdd.setBounds(400, 140, 140, 20);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookName = bookNameTF.getText();
                String author = bookAuthorTF.getText();
                int publishYear = Integer.parseInt(bookPublishYearTF.getText());

                Kniha kniha = new Kniha(bookName, author, publishYear);

                library.add(kniha);

                booksList.setText(printBooks(library));

                System.out.println(library);

                bookNameTF.setText("");
                bookAuthorTF.setText("");
                bookPublishYearTF.setText("");
            }
        });
        panelBook.add(btnAdd);


        frame.pack();
        frame.setVisible(true);

    }


    public static String printBooks(ArrayList<Kniha> books){
        String allBooks = "";
        for(int i = 0; i < books.size(); i++){
            allBooks = allBooks + (i+1) + ". " + books.get(i) + "\n";
        }
        return allBooks;
    }

    public static ArrayList<Kniha> searchForBook(ArrayList<Kniha> books, String keyWord){
        ArrayList<Kniha> result = new ArrayList<>();
        for( Kniha k: books){
            if(k.getNazov().toLowerCase().contains(keyWord.toLowerCase()) || k.getAutor().toLowerCase().contains(keyWord.toLowerCase())){
                result.add(k);
            }
        }
        return result;
    }
}
