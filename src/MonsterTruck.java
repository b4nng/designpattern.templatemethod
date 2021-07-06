public class MonsterTruck extends Carro{
    public MonsterTruck(String marca, String cor, String modelo) {
        super(marca, cor, modelo);
    }

    @Override
    public String getTipo() {
        return "Caminhão Monstro";
    }

    @Override
    public String getCategoria() {
        return "C";
    }
}
