package criacionalPrototype;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiroBase = new Personagem("Guerreiro Base", "Guerreiro", 3, 500, 200);

        // exibição
        System.out.println("=== Personagem Base ===");
        System.out.println(guerreiroBase);
        System.out.println();

        // clonagem dos personagens
        Personagem clone1 = guerreiroBase.clone();
        clone1.setNome("Vieira");

        Personagem clone2 = guerreiroBase.clone();
        clone2.setNome("Thor");

        Personagem clone3 = guerreiroBase.clone();
        clone3.setNome("Loki");

        Personagem clone4 = guerreiroBase.clone();
        clone4.setNome("Iron");

        Personagem clone5= guerreiroBase.clone();
        clone5.setNome("Lima");

        // exibir todos os clonados
        System.out.println("=== Personagens Clonados ===");
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
        System.out.println(clone5);
    }
}
