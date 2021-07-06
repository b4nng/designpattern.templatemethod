public class Suv extends Carro{
    public Suv(String marca, String cor, String modelo) {
        super(marca, cor, modelo);
    }

    @Override
    public String getTipo() {
        return "SUV";
    }

    @Override
    public String getCategoria() {
        return "B";
    }
}
