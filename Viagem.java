
import java.util.ArrayList;

public class Viagem {

    // Criando o objeto GPS para simular localizações no RS
    private GPS gps = new GPS(-33.752084, -27.289155, -57.644144, -49.718808);

    // Atributos
    private String partida;
    private String chegada;
    private double[] partida_latlong;
    private double[] chegada_latlong;
    private double distanciaKm;
    private Veiculo veiculo;
    private Motorista motorista;
    private ArrayList<Eletroposto> eletropostos;
    private double[] trajeto;

    // Método Costrutor
    public Viagem(String partida, String chegada, Motorista motorista, Veiculo veiculo, ArrayList<Eletroposto> eletropostos) {

        this.partida = partida;
        this.chegada = chegada;
        this.veiculo = veiculo;
        this.motorista = motorista;
        
        partida_latlong = gps.gerarLatLong(partida);
        chegada_latlong = gps.gerarLatLong(chegada);
        distanciaKm = gps.calcularDistancia(partida_latlong[0], partida_latlong[1], chegada_latlong[0], chegada_latlong[1])
    
    }

    // Método para gerar a rota de viagem
    public void rota() {
        
        

    }
    
}