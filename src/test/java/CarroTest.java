import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro();
    }

    // Carro disponível

    @Test
    public void naoDeveDisponibilizarCarroDisponivel() {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        assertFalse(carro.disponibilizar());
    }

    @Test
    public void deveAlugarCarroDisponivel() {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        assertTrue(carro.alugar());
        assertEquals(CarroEstadoAlugado.getInstance(), carro.getEstado());
    }

    @Test
    public void deveFazerManutencaoCarroDisponivel() {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        assertTrue(carro.fazerManutencao());
        assertEquals(CarroEmManutencao.getInstance(), carro.getEstado());
    }

    // Carro em manutenção

    @Test
    public void naoDeveAlugarCarroEmManutencao() {
        carro.setEstado(CarroEmManutencao.getInstance());
        assertFalse(carro.alugar());
    }

    @Test
    public void naoDeveFazerManutencaoCarroEmManutencao() {
        carro.setEstado(CarroEmManutencao.getInstance());
        assertFalse(carro.fazerManutencao());
    }

    @Test
    public void deveDisponibilizarCarroManutencao() {
        carro.setEstado(CarroEmManutencao.getInstance());
        assertTrue(carro.disponibilizar());
        assertEquals(CarroEstadoDisponivel.getInstance(), carro.getEstado());
    }

    // Carro alugado

    @Test
    public void naoDeveAlugarCarroAlugado() {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        assertFalse(carro.alugar());
    }

    @Test
    public void naoDeveFazerManutencaoCarroAlugado() {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        assertFalse(carro.alugar());
    }

    @Test
    public void deveDisponibilizarCarroAlugado() {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        assertTrue(carro.disponibilizar());
        assertEquals(CarroEstadoDisponivel.getInstance(), carro.getEstado());
    }
}