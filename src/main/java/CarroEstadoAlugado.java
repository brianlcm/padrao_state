public class CarroEstadoAlugado extends CarroEstado {
    private CarroEstadoAlugado() {};
    private static CarroEstadoAlugado instance = new CarroEstadoAlugado();
    public static CarroEstadoAlugado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Alugado";
    }

    public boolean disponibilizar(Carro carro) {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        return true;
    }

}
