

public class GPS {

    // Atributos
    private double LATITUDE_MIN; // Latitude mais ao sul
    private double LATITUDE_MAX; // Latitude mais ao norte
    private double LONGITUDE_MIN; // Longitude mais ao oeste
    private double LONGITUDE_MAX; // Longitude mais ao leste

    // Método Construtor
    public GPS(double LATITUDE_MIN, double LATITUDE_MAX, double LONGITUDE_MIN, double LONGITUDE_MAX) {
        this.LATITUDE_MIN = LATITUDE_MIN;
        this.LATITUDE_MAX = LATITUDE_MAX;
        this.LONGITUDE_MIN = LONGITUDE_MIN;
        this.LONGITUDE_MAX = LONGITUDE_MAX;
    }

    // Método para retornar a longitude e latitude de um endereço de forma aleatoria
    public double[] gerarLatLong(String endereco) {
        
        Random random = new Random();
        
        double latitude = LATITUDE_MIN + (LATITUDE_MAX - LATITUDE_MIN) * random.nextDouble();
        double longitude = LONGITUDE_MIN + (LONGITUDE_MAX - LONGITUDE_MIN) * random.nextDouble();
        
        return new double[] {latitude, longitude};
    }


    // Método para calcular a distância entre dois pontos usando a fórmula de Haversine
    public static double calcularDistancia(double lat1, double lon1, double lat2, double lon2) {
        final int RAIO_TERRA_KM = 6371; // Raio aproximado da Terra em quilômetros

        // Calcula a diferença em radianos entre as latitudes e longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        // Aplica a fórmula de Haversine
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        
        // Retorna a distância entre os pontos em quilômetros
        return RAIO_TERRA_KM * c;
    }


    // Método para gerar uma linha reta entre dois pontos, dividida em segmentos intermediários
    public List<double[]> criarLinhaReta(double[] pontaSaida, double pontoChegada[]) {
        List<double[]> linha = new ArrayList<>();
        
        // Gera n+1 pontos ao longo da linha reta entre lat1, lon1 e lat2, lon2
        for (int i = 0; i <= n; i++) {
            double fração = (double) i / n; // Determina a fração entre 0 e 1 para cada ponto intermediário
            
            // Interpola latitude e longitude para o ponto atual
            double latitude = lat1 + fração * (lat2 - lat1);
            double longitude = lon1 + fração * (lon2 - lon1);
            
            // Adiciona o ponto interpolado à lista de pontos da linha reta
            linha.add(new double[] {latitude, longitude});
        }
        
        return linha; // Retorna a lista de pontos na linha reta
    }
    
}