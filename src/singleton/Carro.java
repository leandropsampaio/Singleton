package singleton;

/**
 *
 * @author Leandro Pereira Sampaio
 */

public class Carro {

    private static Carro instancia;
    private String nome;
    private String ano;

    // Gerando uma instância de carro, caso ela ainda não exista
    public static Carro getInstancia() {
        if (instancia == null) {
            instancia = new Carro();
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
