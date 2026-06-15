package criacionalPrototype;

public class Personagem implements Cloneable {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int ataque;

    public Personagem(String nome, String classe, int nivel, int vida, int ataque) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Classe: " + classe + " | Nível: " + nivel + " | Vida: " + vida + " | Ataque: " + ataque;
    }

    //método clone
    @Override
    public Personagem clone() {
        try {
            return (Personagem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro crítico: A classe não suporta clonagem.", e);
        }
    }
}