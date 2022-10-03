import java.util.ArrayList;

public class Ambiente {

    ArrayList<Animal> animais = new ArrayList<>();
    public void adicionar_animal(Animal novo_animal) {
        animais.add(novo_animal);
    }

    public void remover_animal(String nome) {
        for(int i = 0; i < animais.size(); i++) {
            if (animais.get(i).get_nome().equals(nome)) {
                animais.remove(i);
                break;
            }
        }
    }

}
