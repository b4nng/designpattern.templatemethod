import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCarro {
    @Test
    public void deveSerCaminhaoMonstro(){
        MonsterTruck monstro = new MonsterTruck("Ford", "Azul", "F250");
        Assertions.assertEquals("O tipo de corrida que este carro se encontra é o de Caminhão Monstro na categoria C", monstro.tipoParaCorrida());
    }
}
