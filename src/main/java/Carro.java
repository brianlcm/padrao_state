public class Carro {
    private String modelo;
    private CarroEstado estado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CarroEstado getEstado() {
        return estado;
    }

    public void setEstado(CarroEstado estado) {
        this.estado = estado;
    }

    public Carro() {
        this.estado = CarroEstadoDisponivel.getInstance();
    }

    public boolean disponibilizar() {
        return estado.disponibilizar(this);
    }

    public boolean alugar() {
        return estado.alugar(this);
    }

    public boolean fazerManutencao() {
        return estado.fazerManutencao(this);
    }
}
