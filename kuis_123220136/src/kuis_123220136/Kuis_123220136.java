package kuis_123220136;

import java.awt.event.*;
import javax.swing.*;

public class Kuis_123220136{
    static class Login extends JFrame{
//        Deklarasi Objek
        JLabel lhead,luser,lpass; 
        JPasswordField fpass;
        JTextField fuser;
        JButton blogin;
        public Login(){
            setTitle("Menu Login"); //set judul frame
            
//            Pemanggilan objek
            lhead = new JLabel("Login Dulu boss");
            luser = new JLabel("Username");
            lpass = new JLabel("Password");            
            fuser = new JTextField();
            fpass = new JPasswordField();
            blogin = new JButton("Masuk");

            setLayout(null);
            
//            Objek ditampilkan dalam frame
            add(lhead);
            add(luser);
            add(lpass);
            add(fuser);
            add(fpass);
            add(blogin);

//            setting posisi objek
            lhead.setBounds(150, 15, 150, 30);
            luser.setBounds(15, 60, 150, 30);
            lpass.setBounds(15, 100, 150, 30);
            fuser.setBounds(100, 60, 150, 30);
            fpass.setBounds(100, 100, 150, 30);
            blogin.setBounds(170, 160, 100, 30);
            
//            event handling button login
            blogin.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    
                    if (fuser.getText().isEmpty() || fpass.getText().isEmpty()){ 
//                            jika field kosong maka panel muncul & gabisa login
                            JOptionPane.showMessageDialog(null, "Semua kolom harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    String user = fuser.getText();
                    String pass = fpass.getText();
                    
//                    cek apakah username & pasword benar
                    if (user.equals("tukang_136")&&pass.equals("tukang_136")){
                        dispose(); //hapus atau matikan frame ini
                        new Hitungsiku().setVisible(true); //buka frame selanjutnya
                    }else {
                        JOptionPane.showMessageDialog(null,"username atau password salah"); //panel kalau pass/username salah
                        return;
                    }   
                }
            });
            
            setSize(400,500); //set ukuran frame
            setVisible(true); //frame ditampilkan
            setLocationRelativeTo(null); //frame posisi di tengah monitor
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //matikan program saat pencet x
        }
    }
    
    public static void main(String[] args) {
            Login x = new Login();
    }
    
}
