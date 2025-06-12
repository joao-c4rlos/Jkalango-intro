public abstract class Personagem {
 public abstract void mover();
 protected  int energia;
 public abstract void fazerSom();
 public abstract void comer();
 protected String nome;
 

 
 public void dormir(){
    energia += 10;
    System.out.println("Você dormiu, +10 energia!");

 }

 public String getNome() {
   return nome;
}
 public int getEnergia() {
   return energia;
 }

 
}
