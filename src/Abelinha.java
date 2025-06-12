public class Abelinha extends Personagem implements IArmamento{

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        System.out.println("voando nos 360 graus... na doida");
        energia -=1;
    }

    @Override
    public void fazerSom() {
        // TODO Auto-generated method stub
        System.out.println("Bzzzz!");
    }
    public Abelinha(String nomeAbelha){
        energia =10;
        nome = nomeAbelha;
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        System.out.println("Comendo...");
       energia +=3;
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        System.out.println("Apenas uma ferramenta de ataque: Lança");
    }

}
