public class Carnivoro extends Animal {

    public Carnivoro(String nome, double peso, double altura, String cor){
        super(nome, peso, altura, cor);
    }
  
    //sobrescrita de metodo
    public String comer(double peso) {
      this.peso += 1;
      return this.nome + " está comendo carne\n";
    }
}
