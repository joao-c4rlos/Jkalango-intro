//pacote
package br.com.jkalango.view;
//Classe swing
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//classe AWT
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener  ;

public class JSplash extends JFrame{
    //1°) O formulário (JfFrame)
public JSplash(){
    setTitle("JKalango Splash Screen");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());


    //2°) Mostrar o formulário
    JButton startButton = new JButton("Start");
    add(startButton);

    //3°) Adicionar o JButton com o título start
    startButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            new JIntro();
        }
        
    });

    //4°) Adicionar um evento ao botão que ao clicar mostre "JKalango"
    setVisible(true);

    //5°) Colocar a imagem do JKalango (sem animação)

}
    
}
