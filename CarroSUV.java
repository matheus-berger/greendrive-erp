//importando o tempo
import java.time.LocalDate;

public class CarroSUV extends Veiculo{
        // criando os atributos
        private final int limiteAutonomia = 400;
        private final int tempoCarga = 8;
    
        // crinado o metodo construtor
        public CarroSUV (String indentificacao, String marca, String modelo, LocalDate fabricacao, Double capacidadeTotal, Double autonomiaMaxima){
            // chamando o super para a classe mãe 
            super(indentificacao, marca, modelo, fabricacao, capacidadeTotal, autonomiaMaxima);

            // criando um if para comparar o valor da autonomia Maxima
            if (autonomiaMaxima > limiteAutonomia){
                System.out.println("Autonomia fora do limite maximo");
            }
        }
    
}