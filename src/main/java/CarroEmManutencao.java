public class CarroEmManutencao extends CarroEstado {
    private CarroEmManutencao() {};
    private static CarroEmManutencao instance = new CarroEmManutencao();
    public static CarroEmManutencao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em manutenção";
    }

    public boolean disponibilizar(Carro carro) {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        return true;
    }
}
