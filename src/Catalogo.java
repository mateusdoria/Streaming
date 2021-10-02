import java.util.ArrayList;
import java.util.Scanner;


public class Catalogo {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        Filme objFilme;
        String titulo, genero, diretor;
        int duração;

        do {
            showMenu();
            menu = entrada.nextInt();
            switch (menu){
                case 1://adicionar
                    System.out.println("===> Cadastra Filmes");
                   System.out.println("Digite o titulo:");
                   titulo =  entradaString.nextLine();
                   System.out.println("Digite o genero:");
                   genero = entradaString.nextLine();
                   System.out.println("Digite o diretor:");
                   diretor = entradaString.nextLine();
                   System.out.println("Digite a duração:");
                   duração = entrada.nextInt();
                   System.out.println("Titulo adicionado com sucesso!!");

                   //criar objeto
                    objFilme = new Filme(titulo, genero, diretor, duração);

                    //gravar na lista
                    ItemAgrupado.adicionar(objFilme);
                    break;
                case 2:
                    System.out.println("===> Listar Filmes:");
                    System.out.println(ItemAgrupado.listar());
                    break;
                case 3:
                    System.out.println("===> Excluir Titulo:");
                    System.out.println("Digite o titulo do filme:");
                    titulo = entradaString.nextLine();

                    if(!(ItemAgrupado.getListFilmes().isEmpty())){
                        //não vazio
                        if(ItemAgrupado.remover(titulo)){
                            System.out.println("Titulo removido com sucesso!");
                        }
                    }else{
                        System.out.println("Não existem titulos cadastrados!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (menu != 4);}
        //looping
        static void showMenu(){
            System.out.println("=========== Catalogo ==========");
            System.out.println("1 Adicionar Filme");
            System.out.println("2 Listar Filme");
            System.out.println("3 Excluir titulos");
            System.out.println("4 Sair");
            System.out.println("===> Escolha uma opção:");

        }
    }





