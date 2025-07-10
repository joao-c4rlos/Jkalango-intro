package jkalangoconsole;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;

public class JCadastroJogador extends JFrame {
    public JCadastroJogador() {
        setTitle("Faça parte do JKalango ");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(25);
        add(lblNome);
        add(txtNome);

        JLabel lblNickName = new JLabel("Nickname:");
        JTextField txtNick = new JTextField(25);
        add(lblNickName);
        add(txtNick);

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField(25);
        add(lblEmail);
        add(txtEmail);

        JLabel lblCelular = new JLabel("Celular:");
        JTextField txtCelular = new JTextField(25);
        add(lblCelular);
        add(txtCelular);

        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField passSenha = new JPasswordField(25);
        add(lblSenha);
        add(passSenha);

        JButton btnCadastrar = new JButton("Cadastrar");
        add(btnCadastrar);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String nickname = txtNick.getText();
                String email = txtEmail.getText();
                String celular = txtCelular.getText();
                String senha = new String(passSenha.getPassword());

                try {
                    String json = String.format(
                        "{\"nome\":\"%s\", \"nickname\":\"%s\", \"email\":\"%s\", \"celular\":\"%s\", \"senha\":\"%s\"}",
                        nome, nickname, email, celular, senha
                    );

                    URL url = new URL("http://localhost:8081/jogador");
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("POST");
                    con.setRequestProperty("Content-Type", "application/json; utf-8");
                    con.setDoOutput(true);

                    try (OutputStream os = con.getOutputStream()) {
                        byte[] input = json.getBytes("utf-8");
                        os.write(input, 0, input.length);
                    }

                    int responseCode = con.getResponseCode();
                    if (responseCode == 200 || responseCode == 201) {
                        JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar jogador. Código: " + responseCode);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao conectar com a API: " + ex.getMessage());
                }
            }
        });

        setVisible(true);
    }
}