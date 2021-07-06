import java.util.logging.ConsoleHandler;

public abstract class Carro {
    private String marca;
    private String cor;
    private String modelo;

    public Carro(String marca, String cor, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract String getTipo();

    public abstract String getCategoria();

    public String tipoParaCorrida(){
        return "O tipo de corrida que este carro se encontra é o de "+getTipo()+" na categoria "+getCategoria();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
