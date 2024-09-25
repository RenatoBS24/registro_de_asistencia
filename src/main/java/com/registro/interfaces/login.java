package com.registro.interfaces;

import com.registro.classes.validate_credentials;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login extends JFrame {
    private JPanel panel;
    private JPanel data_panel;
    private JLabel tittle;
    private JTextField email_field;
    private JPasswordField password_field;
    private JButton button_start;
    private JLabel logo;
    private JLabel report_name;
    private JLabel report_pass;
    private validate_credentials vc = new validate_credentials();
    public login() {
        setContentPane(panel);
        setTitle("Inicio de sesion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(670,458);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        button_start.addActionListener(e -> {
            report_name.setText("");
            report_pass.setText("");
            String user =email_field.getText();
            String pass = String.valueOf(password_field.getPassword());
            int confirmation = vc.validate(user,pass);
            if(confirmation == 0){
                report_name.setText("El usuario ingresado no es valido");
                email_field.setText("");
            } else if (confirmation == 2) {
                report_pass.setText("La contraseña ingresda no es valida");
                password_field.setText("");
            } else if (confirmation == 1) {
                login.this.dispose();

            }
        });

        email_field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                email_field.setText("");
                password_field.setText("");
            }
        });
    }
}
