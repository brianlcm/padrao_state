public abstract class CarroEstado {

    public abstract String getEstado();

    public boolean disponibilizar(Carro carro) {
        return false;
    }

    public boolean alugar(Carro carro) {
        return false;
    }

    public boolean fazerManutencao(Carro carro) {
        return false;
    }
}
