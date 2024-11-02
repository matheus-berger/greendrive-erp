

// Criação da Classe
public class Motorista {

    // Atributos
    private String nome;
    private String numero_identificacao;
    private String numero_habilitacao;
    private String nivel; // (iniciante, intermediário, avançado)

    // Método Construtor
    public Motorista(String nome, String numero_identificacao, String numero_habilitacao, String nivel) {
        
        // Somente Cadastra o motorista se os dados inseridos estiverem corretos
        if (nivel.toLowerCase().matches("iniciante|intermediário|avançado")) {
            this.nivel = nivel;
            this.nome = nome;
            this.numero_identificacao = numero_identificacao;
            this.numero_habilitacao = numero_habilitacao;
        } else {
            System.out.println("Erro: Nivel Invalido!");
            System.out.printf("Por favor, cadastre novamente o motorista {this.nome}, utilizando apenas os seguintes niveis: ");
            System.out.println("Iniciante, Intermediário, Avançado");
        } 
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getNumero_identificacao() {
        return numero_identificacao;
    }

    public String getNumero_habilitacao() {
        return numero_habilitacao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero_identificacao(String numero_identificacao) {
        this.numero_identificacao = numero_identificacao;
    }

    public void setNumero_habilitacao(String numero_habilitacao) {
        this.numero_habilitacao = numero_habilitacao;
    }

    public void setNivel(String nivel) {
        
        if (nivel.toLowerCase().matches("iniciante|intermediário|avançado")) {
            this.nivel = nivel;
        } else {
            System.out.println("Erro: Nivel Invalido!");
            System.out.println("Por favor, utilize apenas os seguintes niveis:");
            System.out.println("Iniciante, Intermediário, Avançado");
        }  
    }
}