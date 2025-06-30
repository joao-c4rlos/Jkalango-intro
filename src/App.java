import br.com.jkalango.view.JIntro;
import br.com.jkalango.view.JSplash;

public class App {
    public static void main(String[] args) throws Exception {
        new JSplash();
        
        Formiga f = new Formiga("JFormiga");
        System.out.println(f.getNome());
        f.mover();
        System.out.println("Energia Formiga: " + f.getEnergia());
        f.mover();
        System.out.println("Energia Formiga: " + f.getEnergia());
        f.mover();
        System.out.println("Energia Formiga: " + f.getEnergia());
        f.fazerSom();
        f.comer();
        System.out.println("Formiga +5 de energia!!");
        f.dormir();
        if (f.getEnergia()<5 ) {
            System.out.println("o animal esta cansado e sua energia é: "+f.getEnergia());
            
        }else {
        System.out.println("Energia Formiga: " + f.getEnergia());
        }

        Kalango k = new Kalango("JKalango");
        System.out.println(k.getNome());
        k.mover();
        System.out.println("Energia Kalango: " + k.getEnergia());
        k.mover();
        System.out.println("Energia Kalango: " + k.getEnergia());
        k.mover();
        System.out.println("Energia Kalango: " + k.getEnergia());
        k.fazerSom();
        k.comer();
        System.out.println("Kalango +8 de energia!!");
        k.dormir();
        if (k.getEnergia()<5 ) {
            System.out.println("o animal esta cansado e sua energia é: "+k.getEnergia());
            
        }else {
            System.out.println("Energia Kalango: " + k.getEnergia());
        }
    
        Abelinha a = new Abelinha("JAbelha");
        System.out.println(a.getNome());
        a.mover();
        System.out.println("Energia Abelinha: " + a.getEnergia());
        a.mover();
        System.out.println("Energia Abelinha: " + a.getEnergia());
        a.mover();
        System.out.println("Energia Abelinha: " + a.getEnergia());
        a.fazerSom();
        a.comer();
        System.out.println("Abelinha +3 de energia!!");
        a.dormir();
        if (a.getEnergia()<5 ) {
            System.out.println("o animal esta cansado e sua energia é: "+a.getEnergia());
            
        }else {
        System.out.println("Energia Abelinha: " + a.getEnergia());
        }
    }
}
