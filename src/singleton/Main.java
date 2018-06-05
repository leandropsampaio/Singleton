package singleton;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class Main {

    public static void main(String[] args) {

        // Gerando uma instância de carro
        Carro carro = Carro.getInstancia();
        carro.setNome("Gol");
        carro.setAno("2015");
        System.out.println("Nome: " + carro.getNome() + " Ano: " + carro.getAno());

        // Mesmo mandando gerar uma nova instância de carro, ela não será feita
        carro = Carro.getInstancia();
        System.out.println("Nome: " + carro.getNome() + " Ano: " + carro.getAno());
    }
}
