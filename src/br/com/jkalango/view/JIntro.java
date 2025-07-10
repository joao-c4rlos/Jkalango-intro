package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import jkalangoconsole.JCadastroJogador;

import java.awt.Color;
//classe AWT
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JIntro extends JFrame {
    public JIntro() {
        setTitle("JKalango");
        setSize(700, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.DARK_GRAY);
        String intro = "<html><body style='width: 450px;'>"
                + "Nas entranhas apodrecidas de um mundo esquecido, onde o céu sangra em silêncio e o chão sussurra horrores antigos, rasteja uma criatura de escamas ressecadas e olhos ocos: <br> JKalango, o último de uma linhagem profanada pelo tempo.<br>"
                + //
                "\n" +
                "Nascido das cinzas de um cerrado amaldiçoado, onde a vida se retorce em espasmos de dor e as árvores gemem como cadáveres pendurados, JKalango não busca glória… ele busca a perpetuação de sua espécie moribunda, cuja carne apodrece antes mesmo de nascer. Mas não está sozinho.<br>"
                + //
                "\n" +
                "Ao seu lado, rastejam os poucos que ainda não foram devorados pela decadência:<br>" + //
                "JFormigas, espectros minúsculos com mandíbulas enferrujadas, que perfuram carne e ossos ao sussurro da fome eterna…<br>"
                +
                "JAbelinhas, seres deformados, cobertos de pelos enegrecidos e olhos vazios, que destilam um mel espesso e negro como óleo, capaz de dissolver a alma de quem o prova.<br>"
                + //
                "\n" +
                "Mas há um preço para tentar sobreviver naquele mundo empesteado: Missões. Cada uma delas mais hedionda que a outra. Missões que exigem o fôlego arrancado dos vivos, o sangue fermentado de bestas esquecidas e o enfrentamento de horrores que não têm nome — pois os nomes foram engolidos pelas trevas há séculos.<br>"
                + //
                "\n" +
                "Cada passo de JKalango é um arrasto no lodo pulsante da insanidade. A cada missão, ele se aproxima mais do abismo que separa a razão do delírio. A cada vitória, ele se despedaça um pouco mais por dentro, enquanto uma voz soturna sussurra dentro de sua cabeça:<br>"
                + //
                "“Preservar… ou perecer.”<br>" +
                "\n" +
                "E no fim, quando tudo for consumido e a última gota de esperança apodrecer em silêncio… ele terá que escolher: salvar os seus ou devorá-los.<br>"
                +
                "\n" +
                "" + "</body></html>";
        JLabel labelTexto = new JLabel(intro);
     
        labelTexto.setForeground(java.awt.Color.WHITE); // letras brancas
        add(labelTexto);

        // 2°) Mostrar o formulário
        JButton startButton = new JButton("Iniciar primeira missão");
        add(startButton);

        // 3°) Adicionar o JButton com o título start
        startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new JCadastroJogador();
                // TODO Auto-generated method stub
                //JOptionPane.showMessageDialog(JIntro.this, "Primeira missão iniciada");

            }

        });
        setVisible(true);
    }
}