public class Kalango extends Personagem implements IArmamento{
    
    @Override
    public void mover() {
        // TODO Auto-generated method stub
        System.out.println("Terrestre com velocidade");   
        energia-=3;
        
    }

    @Override
    public void fazerSom() {
        // TODO Auto-generated method stub
        System.out.println("Tssss!");
    }
    public Kalango(String nomeKalango){
        energia = 5;
        nome = nomeKalango;
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        System.out.println("Comendo...");
       energia +=8;
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        System.out.println("Duas ferramentas de ataque: Espada longa e espada curta");
    }

   
}