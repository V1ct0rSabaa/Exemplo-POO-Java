public abstract class Animal {

    protected String nome;
    protected double peso;
    protected double altura;
    protected String cor;

    public Animal(String nome, double peso, double altura, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.cor = cor;
    }

    public String get_nome() {
        return this.nome;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }

    public double get_peso() {
        return this.peso;
    }

    public void set_peso(double peso) {
        this.peso = peso;
    }

    public double get_altura() {
        return this.altura;
    }

    public void set_altura(double altura) {
        this.altura = altura;
    }

    public String get_cor() {
        return this.cor;
    }

    public void set_cor(String cor) {
        this.cor = cor;
    }

    public double andar() {
      double caminhada = this.altura - (this.peso / 100);
      return caminhada;
    }

    public double correr() {
      double corrida = (this.altura * 1.2) - (this.peso / 100);
      return corrida;
    }

    public String comer() {
      return this.nome + " esta comendo\n";
    }

    public String get_dados() {
        String texto = "Nome: " + get_nome() +"\nPeso: " + get_peso() + " kg\nAltura: " + get_altura() + " m\nVelocidade caminhada: " + andar() + " m/s\nVelocidade corrida: " + correr() + " m/s\n";
      return texto;
    }
}
