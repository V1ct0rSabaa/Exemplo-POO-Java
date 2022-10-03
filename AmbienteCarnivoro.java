public class AmbienteCarnivoro extends Ambiente {
  public AmbienteCarnivoro() {
    super(); //herdando construtor
  }
  
  public void set_animais_padrao(){
    Carnivoro l1 = new Carnivoro("Lobo_vermelho", 33, 0.63, "Cinza e vermelho");
    Carnivoro t1 = new Carnivoro("Urso_pardo", 150, 2.2, "Castanho");
    Carnivoro o1 = new Carnivoro("Ocelote", 9, 0.62, "Amarelo com manchas pretas");
    adicionar_animal(l1);
    adicionar_animal(t1);
    adicionar_animal(o1);
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

  public String editar_animal(String nome_antigo, String nome_novo, Carnivoro c1) {
    String texto = "não foi possível encontrar um animal carnívoro chamado " + nome_antigo;
    for(int i = 0; i < animais.size(); i++) {
        if (animais.get(i).get_nome().equals(nome_antigo)) {
            animais.set(i, c1);
            texto = "O animal " + nome_antigo + " foi subistituído por " + nome_novo + "\n";
            break;
        }
    }
    return texto;
  }
}
