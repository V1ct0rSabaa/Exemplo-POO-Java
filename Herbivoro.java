public class Herbivoro extends Animal {

    public Herbivoro(String nome, double peso, double altura, String cor) {
        super(nome, peso, altura, cor);

    }

    public String comer(double peso) {
      this.peso += 1;
      return this.nome + " esta comendo plantas\n";
    }

}
