public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Francisco", 29, 12, 1997, "c");
        p1.Status();
        Pessoa p2 = new Pessoa("Jorge", 11, 11, 2002, "s");
        p2.Status();
        Pessoa p3 = new Pessoa("Abel", 12, 12, 2017, "s");
        p3.Status();
        Pessoa p4 = new Pessoa("Ruben", 15, 12, 1990, "u");
        p4.Status();
        Pessoa p5 = new Pessoa("Maria", 13, 12, 2009, "s");
        p5.Status();

        p1.informacaoMaiorIdade(1990);


    }

}
