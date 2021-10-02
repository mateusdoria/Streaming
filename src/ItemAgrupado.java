import java.util.ArrayList;

    public class ItemAgrupado extends Item{
        //GET
        public static ArrayList<Filme> getListFilmes() {
            return listFilmes;
        }

        public static ArrayList<Filme> listFilmes = new ArrayList<>();
        public ItemAgrupado(String titulo, String genero, String diretor, int duração, int temporada) {
            super(titulo, genero, diretor, duração);
        }

        public static ArrayList<Serie> listSeries = new ArrayList<>();
        public void Serie (String titulo, String genero, String diretor, int duração, int temporada) {
        }
        //adicionar
        static public void adicionar(Filme f){
            listFilmes.add(f);
        }
       //listar dados
        static public String listar(){
            String saida = "";
            int i = 1;
            for(Filme f : listFilmes){
                saida +="\n====Filme:" + (i++);
                saida += f.imprimir() + "\n";
            }
            return saida;
        }
        //remover filmes
        static public boolean remover(String titulo) {
            for (Filme f : listFilmes) {
                if (f.getTitulo().equalsIgnoreCase(titulo)) {
                    listFilmes.remove(f);
                    return true;

                }
            }
            return false;
        }

    }


