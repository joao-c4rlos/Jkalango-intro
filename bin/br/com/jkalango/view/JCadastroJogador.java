package jkalangoconsole.bin.br.com.jkalango.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JCadastroJogador extends JFrame {
    //Construtor inicializa os componentes do formulário
    public JCadastroJogador(){
        //Título da janela
        setTitle("Faça parte do JKalango ");
        //garante que a aplicação não seja encerrada
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //tamanho da janela 
        setSize(400, 450);
        //posição ao centro
        setLocationRelativeTo(null);
        //estética
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(25);
        add(lblNome);
        add(txtNome);
        JLabel lblNickName = new JLabel("Nickname: ");
        JTextField txtNick = new JTextField(25);
        add(lblNickName);
        add(txtNick);
        JLabel lblEmail = new JLabel("Email: ");
        JTextField txtEmail = new JTextField(25);
        add(lblEmail);
        add(txtEmail);
        JLabel lblCelular = new JLabel("Celular: ");
        JTextField txtCelular = new JTextField(25);
        add(lblCelular);
        add(txtCelular);
        JLabel lblSenha = new JLabel("Senha: ");
        JPasswordField passSenha = new JPasswordField(25);
        add(lblSenha);
        add(passSenha);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, "JOgador cadastrado com sucesso");

            }
            
        });
        setVisible(true);

    }

}
