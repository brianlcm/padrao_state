public class CarroEstadoDisponivel extends CarroEstado {
    private CarroEstadoDisponivel() {};
    private static CarroEstadoDisponivel instance = new CarroEstadoDisponivel();
    public static CarroEstadoDisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Disponível";
    }

    public boolean alugar(Carro carro) {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        return true;
    }

    public boolean fazerManutencao(Carro carro) {
        carro.setEstado(CarroEmManutencao.getInstance());
        return true;
    }
}
