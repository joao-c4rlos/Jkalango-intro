public class Formiga extends Personagem implements IArmamento{

    public int getEnergia;

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        System.out.println("Movendo...");
        energia -=2;
    }

    @Override
    public void fazerSom() {
        // TODO Auto-generated method stub
        System.out.println("Fzzzz!");
    }
    public Formiga(String nomeFormiga){
        energia =25;
        nome = nomeFormiga;
    
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
       System.out.println("Comendo...");
       energia +=5;
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        System.out.println("Quatro ferramentas de ataque: Lança, martelo, espada longa e espada curta");
    }

}
