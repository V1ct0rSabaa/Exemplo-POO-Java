public class AmbienteHerbivoro extends Ambiente {
  public AmbienteHerbivoro() {
    super();
  }
  public void set_animais_padrao(){
    Herbivoro a1 = new Herbivoro("Girafa", 1.1, 5.1, "Alaranjado com manchas pretas");
    Herbivoro z1 = new Herbivoro("Cervo-canadense", 280, 2.25, "Castanho, preto e cinza");
    Herbivoro b1 = new Herbivoro("Coelho", 1.5, 0.2, "Branco e cinza");
    adicionar_animal(a1);
    adicionar_animal(z1);
    adicionar_animal(b1);
  }

  public String listar_animais(){
    String texto = "";
    if(animais.size() == 0){
      texto = "Não tem nenhum animal no ambiente\n";
    }
    else{
      for(int i = 0; i < animais.size(); i++) {
            texto += animais.get(i).get_dados();
      }
    }
    return texto;
  }
  public String editar_animal(String nome_antigo, String nome_novo, Herbivoro h1) {
    String texto = "não foi possivel encontrar um animal Herbivoro chamado " + nome_antigo;
    for(int i = 0; i < animais.size(); i++) {
        if (animais.get(i).get_nome().equals(nome_antigo)) {
            animais.set(i, h1);
            texto = "O animal " + nome_antigo + " foi subistituido por " + nome_novo + "\n";
            break;
        }
    }
    return texto;
  }
}
