// importando o atributo date
import java.time.LocalDate;

// criando a classe Carro Compacto
public class CarroCompacto extends Veiculo{
    private final int limiteAutonomia = 200;
    private final int tempoCarga = 4;

    // crinado o metodo construtor
    public CarroCompacto(String indentificacao, String marca, String modelo, LocalDate fabricacao, Double capacidadeTotal, Double autonomiaMaxima){
        // chamando o super para a classe mãe 
        super(indentificacao, marca, modelo, fabricacao, capacidadeTotal, autonomiaMaxima);

        // criando um if para comparar o valor da autonomia Maxima
        if (autonomiaMaxima > limiteAutonomia){
            System.out.println("Autonomia fora do limite maximo");
        }
    }
}