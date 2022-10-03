import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    AmbienteCarnivoro ac = new AmbienteCarnivoro();
    AmbienteHerbivoro ah = new AmbienteHerbivoro();
    Scanner pegar_input =  new Scanner(System.in);
    ac.set_animais_padrao();
    ah.set_animais_padrao();
    int escolha = 0;
    String menu = "Menu Zoologico\n1 - Adicione um animal ao seu ambiente na reserva\n";
    menu += "2- Altere as informações de um animal da reserva\n";
    menu += "3- Remova um animal da reserva\n";
    menu += "4- Liste os animais de um ambiente da reserva\n";
    menu += "5- Sair do Zoo\n";
    while(escolha != 5){
      System.out.printf(menu);
      escolha = pegar_input.nextInt();
      switch(escolha){
        case 1:
          int tipo_animal = 0;
          System.out.println("Qual tipo de animal deseja cadastrar 1 - Carnívoro ou 2 - Herbívoro");
          tipo_animal = pegar_input.nextInt();
          if (tipo_animal == 1) {
            System.out.println("Digite o nome do Animal: ");
            String nome = pegar_input.next();
            System.out.println("Digite o peso do Animal");
            double peso = pegar_input.nextDouble();
            System.out.println("Digite a altura do Animal");
            double altura = pegar_input.nextDouble();
            System.out.println("Digite a cor do Animal");
            String cor = pegar_input.next();
            Carnivoro carnivoro = new Carnivoro(nome, peso, altura, cor);
            ac.adicionar_animal(carnivoro);
        } 
          else {
            System.out.println("Digite o nome do Animal");
            String nome = pegar_input.next();
            System.out.println("Digite o peso do Animal");
            double peso = pegar_input.nextDouble();
            System.out.println("Digite a altura do Animal");
            double altura = pegar_input.nextDouble();
            System.out.println("Digite a cor do Animal");
            String cor = pegar_input.next();
            Herbivoro herbivoro = new Herbivoro(nome, peso, altura, cor);
            ah.adicionar_animal(herbivoro);
        }
          break;
        case 2:
          System.out.println("Qual tipo de animal deseja editar 1 - Carnivoro ou 2 - Herbivoro");
          tipo_animal = pegar_input.nextInt();
          if (tipo_animal == 1) {
            System.out.println("Digite o nome do Animal Carnivoro a ser editado");
            String nome_antigo = pegar_input.next();
            System.out.println("Digite o novo nome do Animal Carnivoro ");
            String nome_novo = pegar_input.next();
            System.out.println("Digite o novo peso do Animal");
            double peso = pegar_input.nextDouble();
            System.out.println("Digite a nova altura do Animal");
            double altura = pegar_input.nextDouble();
            System.out.println("Digite a nova cor do Animal");
            String cor = pegar_input.next();
            Carnivoro c1 = new Carnivoro(nome_novo, peso, altura, cor);
            ac.editar_animal(nome_antigo, nome_novo, c1);
          } 
          else {
            System.out.println("Digite o nome do Animal Herbivoroa ser editado");
            String nome_antigo = pegar_input.next();
            System.out.println("Digite o  novo nome do Animal Herbivoro ");
            String nome_novo = pegar_input.next();
            System.out.println("Digite o novo peso do Animal");
            double peso = pegar_input.nextDouble();
            System.out.println("Digite a nova altura do Animal");
            double altura = pegar_input.nextDouble();
            System.out.println("Digite a nova cor do Animal");
            String cor = pegar_input.next();
            Herbivoro h1 = new Herbivoro(nome_novo, peso, altura, cor);
            ah.editar_animal(nome_antigo, nome_novo, h1);
          }
          break;
          
        case 3:
          System.out.println("Qual tipo de animal deseja remover 1 - Carnivoro ou 2 - Herbivoro");
          tipo_animal = pegar_input.nextInt();
          if (tipo_animal == 1) {
            System.out.println("Digite o nome do Animal a ser removido");
            String nome_remover = pegar_input.next();
            ac.remover_animal(nome_remover);
          } 
          else {
            System.out.println("Digite o nome do Animal a ser removido");
            String nome_remover = pegar_input.next();
            ah.remover_animal(nome_remover);
          }
          break;
          
        case 4:
          System.out.println("Qual ambiente voce deseja consultar 1 - Carnivoro ou 2 - Herbivoro");
          tipo_animal = pegar_input.nextInt();
          if (tipo_animal == 1) {
            System.out.println(ac.listar_animais());
          } 
          else {
            System.out.println(ah.listar_animais());
          }
          break;
          
        case 5:
          System.out.println("Fim do programa");
          break;
          
        default:
          System.out.println("Opção inválida, tente novamente");
          break;
      }
    }
    pegar_input.close();
  }
    
}
