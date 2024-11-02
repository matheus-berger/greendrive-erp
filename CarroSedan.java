import java.time.LocalDate;

public class CarroSedan extends Veiculo{
    private final int limiteAutonomia = 400;
    private final int tempoCarga = 6;

    // crinado o metodo construtor
    public CarroSedan (String indentificacao, String marca, String modelo, LocalDate fabricacao, Double capacidadeTotal, Double autonomiaMaxima){
        // chamando o super para a classe mãe 
        super(indentificacao, marca, modelo, fabricacao, capacidadeTotal, autonomiaMaxima);

        // criando um if para comparar o valor da autonomia Maxima
        if (autonomiaMaxima > limiteAutonomia){
            System.out.println("Autonomia fora do limite maximo");
        }
    }
}