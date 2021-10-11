public abstract class Lanche {
    // Lanche tem preço
    private double preco;
    private int tempoPreparo;
    private int tempoEntrega;

    // Construtor da superclasse (classe abstrata)
    public Lanche() {
        this.preco=0;
        this.tempoPreparo=0;
        this.tempoEntrega=10;
    }

    public Lanche(double preco, int tempoPreparo, int tempoEntrega) {
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.tempoEntrega = tempoEntrega;
    }

    // Getters e Setters da classe abstrata
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(int tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public int calcularEntrega(int distancia) {
        // Calcular e retornar o tempo de entrega (em minutos)
        return getTempoEntrega()*distancia;
    }

}
