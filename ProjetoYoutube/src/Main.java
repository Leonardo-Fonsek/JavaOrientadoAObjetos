public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Felipe", 28, "M", "Felipinho");
        g[1] = new Gafanhoto("Ayla", 12, "F", "Aylinha");

        Vizualizacao vis = new Vizualizacao(g[0], v[2]);
        System.out.println(vis.toString());

        /*System.out.println("VÍDEOS\n----------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n--------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
         */
    }
}