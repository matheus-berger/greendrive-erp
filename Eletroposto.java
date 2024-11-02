public class Eletroposto{
    private String identificacao;
    private String local;
    private int vagaCarregamento;
    private int tempoMedioCarregamento;

    // criando o metodo construtor
    public Eletroposto(String identificacao, String local, int vagaCarregamento, int tempoMedioCarregamento){
        this.identificacao = identificacao;
        this.local = local;
        this.vagaCarregamento = vagaCarregamento;
        this.tempoMedioCarregamento = tempoMedioCarregamento;
    }
    //criando os gets
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