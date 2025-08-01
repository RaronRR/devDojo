package devdojo.devdojoJavaCoreIntroducaoClasses.CsobreCargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String nomeDoProtagonista;

    //Construtores:
    public Anime(){

    }




    //Forma mais pratica de criar um metodo set que consegue retonar mais valores;

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    //Caso for adicionando mais metodos é sem fazer repetição de codigo:
    public void init(String nome, String tipo, int episodios , String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    public void init(String nome, String tipo,int episodios, String genero, String nomeDoProtagonista) {
        this.init(nome, tipo, episodios, genero);
        this.nomeDoProtagonista = nomeDoProtagonista;
    }




    public void imprimirAnime(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Nome do protagonista: " + this.nomeDoProtagonista);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    //
    public void String () {}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    //
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public int getEpisodios() {
        return this.episodios;
    }
}
