//importando bibliotecas necessarias
import java.time.LocalDate; 

// criando o classe Veiculo
public class Veiculo{
    //criando os atributos
    protected String indentificacao;
    protected String marca;
    protected String modelo;
    protected LocalDate fabricacao;
    protected Double capacidadeTotal;
    protected Double autonomiaMaxima;

    public Veiculo(String indentificacao, String marca, String modelo, LocalDate fabricacao, Double capacidadeTotal, Double autonomiaMaxima){
        this.indentificacao = indentificacao;
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacao = fabricacao;
        this.capacidadeTotal = capacidadeTotal;
        this.autonomiaMaxima = autonomiaMaxima;
    }

    //criando os gets

    public String getIndentificacao(){
        return indentificacao;
    }
     public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public LocalDate getFabricacao(){
        return fabricacao;
    }
    public Double getCapacidadeTotal(){
        return capacidadeTotal;
    }
    public Double getAutonomiaMaxima(){
        return autonomiaMaxima;
    }

    // criando os sets

    public void setIdentificacao(String indentificacao){
        this.indentificacao = indentificacao;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setFabricacao(LocalDate fabricacao){
        this.fabricacao = fabricacao;
    }
    public void setCapacidadeTotal(Double capacidadeTotal){
        this.capacidadeTotal = capacidadeTotal;
    }
    public void setAutonomiaMaxima(Double autonomiaMaxima){
        this.autonomiaMaxima = autonomiaMaxima;
    }

}