package devdojo.devdojoJavaCoreIntroducaoClasses.Dconstructor.test;

import devdojo.devdojoJavaCoreIntroducaoClasses.Dconstructor.dominio.Anime;

public class AnimeTest{
    public static void main(String[] args) {
        Anime anime = new Anime("One piece","netflix", 20, "Syfy", "Luffy", "TOEI Animation" );
        anime.imprimirAnime();

    }
}
