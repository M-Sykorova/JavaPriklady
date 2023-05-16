package sk.macuska.project.course.swing.easy_repository;

import sk.macuska.project.course.swing.easy_repository.Produkt;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SkladApp {
    public static void main(String[] args) {

        ArrayList<Produkt> sklad = new ArrayList<>();
        sklad.add(new Produkt("Ruksak Fjallraven", 2));
        sklad.add(new Produkt("Ciapka Northface", 5));
        sklad.add(new Produkt("Shaker MyProtein", 8));
        sklad.add(new Produkt("Tenisky Converse", 3));

        Font BoldFont = new Font("MV Boli", Font.BOLD, 15);
        Font PlainFont = new Font("MV Boli", Font.PLAIN, 15);

        //FRAME
        JFrame frame = new JFrame("Sklad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600, 600));
        //PANEL
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(241, 190, 139));
        frame.setContentPane(panel);
        //PRIDAJ
        JLabel pridaj = new JLabel("<html><u>Pridanie noveho produktu</u></html>");
        pridaj.setBounds(20, 20, 200, 20);
        pridaj.setFont(BoldFont);
        panel.add(pridaj);
        //ID
        JLabel produktId = new JLabel("ID: ");
        produktId.setBounds(40, 60, 100, 20);
        produktId.setFont(PlainFont);
        panel.add(produktId);

        JTextField idcisloTF = new JTextField();
        idcisloTF.setBounds(140, 60, 400, 20);
        idcisloTF.setHorizontalAlignment(JTextField.RIGHT);
        idcisloTF.setFont(PlainFont);
        idcisloTF.setText(String.valueOf(Produkt.getNextId()));
        idcisloTF.setEditable(false);
        panel.add(idcisloTF);
        //NAZOV
        JLabel produktNazov = new JLabel("Nazov: ");
        produktNazov.setBounds(40, 100, 100, 20);
        produktNazov.setFont(PlainFont);
        panel.add(produktNazov);

        JTextField produktNazovTF = new JTextField();
        produktNazovTF.setBounds(140, 100, 400, 20);
        produktNazovTF.setHorizontalAlignment(JTextField.RIGHT);
        produktNazovTF.setFont(PlainFont);
        panel.add(produktNazovTF);
        //POCET KS
        JLabel produktPocetKs = new JLabel("Pocet ks: ");
        produktPocetKs.setBounds(40, 140, 100, 20);
        produktPocetKs.setFont(PlainFont);
        panel.add(produktPocetKs);

        JTextField produktPocetKsTF = new JTextField();
        produktPocetKsTF.setBounds(140, 140, 400, 20);
        produktPocetKsTF.setHorizontalAlignment(JTextField.RIGHT);
        produktPocetKsTF.setFont(PlainFont);
        panel.add(produktPocetKsTF);



        //VYHLADAVANIE
        JLabel searchLabel = new JLabel("<html><u>Vyhladaj</u></html>");
        searchLabel.setBounds(20, 200, 100, 20);
        searchLabel.setFont(BoldFont);
        panel.add(searchLabel);

        JLabel search = new JLabel("ID/nazov:");
        search.setBounds(40, 240, 100, 20);
        search.setFont(PlainFont);
        panel.add(search);

        JTextField searchTF = new JTextField();
        searchTF.setBounds(140, 240, 200, 20);
        searchTF.setFont(PlainFont);
        searchTF.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(searchTF);

        //ZOZNAM PRODUKTOV
        JLabel produkty = new JLabel("<html><u>Zoznam produktov</u></html>");
        produkty.setBounds(20, 300, 200, 20);
        produkty.setFont(BoldFont);
        panel.add(produkty);


        JTextArea produktList = new JTextArea();
        JScrollPane scrollableTextArea = new JScrollPane(produktList);
        scrollableTextArea.setBounds(20, 340, 520, 200);
        produktList.setFont(PlainFont);
        produktList.setEditable(false);
        produktList.setText(printProduct(sklad));
        panel.add(scrollableTextArea);

        //LOGIKA VYHLADAVANIA
        searchTF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                produktList.setText(printProduct(searchForProduct(sklad, searchTF.getText())));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                produktList.setText(printProduct(searchForProduct(sklad, searchTF.getText())));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                produktList.setText(printProduct(searchForProduct(sklad, searchTF.getText())));
            }
        });


        JButton btnAdd = new JButton("Pridaj produkt");
        btnAdd.setBounds(350, 180, 190, 20);
        btnAdd.setFont(BoldFont);
        panel.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productId = produktId.getText();
                String nazov = produktNazovTF.getText();
                int pocetKusov = Integer.parseInt(produktPocetKsTF.getText());

                Produkt produkt = new Produkt(nazov, pocetKusov);

                sklad.add(produkt);

                produktList.setText(printProduct(sklad));
                System.out.println(sklad);

                produktNazovTF.setText("");
                produktPocetKsTF.setText("");

            }
        });
        panel.add(btnAdd);

        frame.pack();
        frame.setVisible(true);
    }

    public static String printProduct(ArrayList<Produkt> products) {
        String allProducts = "";
        for (int i = 0; i < products.size(); i++) {
            allProducts = allProducts + products.get(i) + "\n";
        }
        return allProducts;
    }

    public static ArrayList<Produkt> searchForProduct(ArrayList<Produkt> products, String keyWord) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (Produkt p : products) {
            if (p.getNazov().toLowerCase().contains(keyWord.toLowerCase()) || String.valueOf(p.getId()).contains(keyWord)) {
                result.add(p);
            }
        }
        return result;
    }
}
