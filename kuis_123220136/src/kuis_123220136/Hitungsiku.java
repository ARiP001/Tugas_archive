package kuis_123220136;

import java.awt.event.*;
import javax.swing.*;

public class Hitungsiku extends JFrame{
    
//        Deklarasi objek
        JLabel lhead,lalas, ltinggi, ljawab;
        JTextField falas, ftinggi;
        JButton bhitung, bexit, breset;
        Hitungsiku(){
            setTitle("Hitung Siku"); //set judul frame
            
//          objek dipanggil
            lhead = new JLabel("Hitung Siku");
            lalas = new JLabel("panjang alas");
            ltinggi = new JLabel("panjang tinggi");
            ljawab = new JLabel();
            falas = new JTextField();
            ftinggi = new JTextField();
            bhitung = new JButton("Hitung");
            bexit = new JButton("Exit");
            breset = new JButton("Reset");

            setLayout(null);
            
//            objek ditampilkan dalam frame
            add(lhead);
            add(lalas);
            add(ltinggi);
            add(falas);
            add(ftinggi);
            add(bhitung);
            add(bexit);
            add(breset);
            add(ljawab);

//            setting posisi objek
            lhead.setBounds(150, 15, 150, 30);
            lalas.setBounds(15, 60, 150, 30);
            ltinggi.setBounds(15, 100, 150, 30);
            falas.setBounds(120, 60, 150, 30);
            ftinggi.setBounds(120, 100, 150, 30);
            bhitung.setBounds(170, 160, 90, 30);
            bexit.setBounds(280, 160, 80, 30);
            breset.setBounds(280, 80, 80, 30);
            ljawab.setBounds(20, 220, 200, 30);
            
//            event handling button hitung
            bhitung.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    try{
                        if (falas.getText().isEmpty() || ftinggi.getText().isEmpty()){ //wajib isi semua field
                            JOptionPane.showMessageDialog(null, "Semua kolom harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                   
//                   ubah alas & tinggi jadi double
                    double alas = Double.parseDouble(falas.getText());
                    double tinggi = Double.parseDouble(ftinggi.getText());
                    
//                    hitung akar
                    double pangkat = (alas*alas) + (tinggi*tinggi);
                    double akar = Math.sqrt(pangkat);
                    
//                    tampilkan akar
                    add(ljawab);
                    ljawab.setText("Sisi miring adalah "+ akar);
                    
                    
                    }catch(NumberFormatException ex){
                        //panel kalau non angka diinput dalam field
                        JOptionPane.showMessageDialog(null, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                }
            });
            
//            event handling button exit
            bexit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); //matikan frame
                System.exit(0); //matikan program
                }
            });
            
//            event handling button reset
            breset.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
//                  setting field jadi kosong
                    falas.setText("");
                    ftinggi.setText("");
                    ljawab.setText("");
                    
                }
            });
            
            setSize(400,500); //ukuran frame
            setVisible(true); //tampilin frame
            setLocationRelativeTo(null); //posisi frame di tengah monitor
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //matikan program saat pencet x
        }
    }
