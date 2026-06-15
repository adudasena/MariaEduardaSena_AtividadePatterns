package criacionalPrototype;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiroBase = new Personagem("Guerreiro Base", "Guerreiro", 1, 100, 15);

        // exibição
        System.out.println("=== Personagem Base ===");
        System.out.println(guerreiroBase);
        System.out.println();

        // clonagem dos 3 personagens
        Personagem clone1 = guerreiroBase.clone();
        clone1.setNome("Vieira");

        Personagem clone2 = guerreiroBase.clone();
        clone2.setNome("Thor");

        Personagem clone3 = guerreiroBase.clone();
        clone3.setNome("Loki");

        Personagem clone4 = guerreiroBase.clone();
        clone3.setNome("Iron");

        // exibir todos os clonados
        System.out.println("=== Personagens Clonados ===");
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
    }
}
