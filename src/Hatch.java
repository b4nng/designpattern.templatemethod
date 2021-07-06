public class Hatch extends Carro{
    public Hatch(String marca, String cor, String modelo) {
        super(marca, cor, modelo);
    }

    @Override
    public String getTipo() {
        return "Sport Hatch";
    }

    @Override
    public String getCategoria() {
        return "A";
    }
}
