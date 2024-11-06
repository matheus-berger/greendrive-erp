public class Eletroposto{
    
    // Criando o objeto GPS para simular localizações no RS
    private GPS gps = new GPS(-33.752084, -27.289155, -57.644144, -49.718808);

    private String identificacao;
    private String local;
    private double[] local_latlong;
    private int vagaCarregamento;
    private int tempoMedioCarregamento;

    // Criando o metodo construtor
    public Eletroposto(String identificacao, String local, int vagaCarregamento, int tempoMedioCarregamento){
        this.identificacao = identificacao;
        this.local = local;
        this.vagaCarregamento = vagaCarregamento;
        this.tempoMedioCarregamento = tempoMedioCarregamento;
        this.local_latlong = gps.gerarLatLong(local);
    }

    
    // Getters e Setters
    public String getIdentificacao(){
        return identificacao;
    }
    public String getLocal(){
        return local;
    }
    public int getVagaCarregamento(){
        return vagaCarregamento;
    }
    public int getTempoMedioCarregamento(){
        return tempoMedioCarregamento;
    }
    public double[] getLocal_latlong() {
        return local_latlong;
    }

    //Criando os sets
    public void setIdentificacao(String identificacao){
        this.identificacao = identificacao;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public void setVagaCarregamento(int vagaCarregamento){
        this.vagaCarregamento = vagaCarregamento;
    }
    public void setTempoMedioCarregamento(int tempoMedioCarregamento){
        this.tempoMedioCarregamento = tempoMedioCarregamento;
    }
}