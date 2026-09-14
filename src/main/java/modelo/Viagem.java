package modelo;

public class Viagem {

    private int id;
    private String veiculo;
    private String destino;
    private String relatorio;

    public Viagem() {
    }

    public Viagem(int id, String veiculo, String destino, String relatorio) {
        this.id = id;
        this.veiculo = veiculo;
        this.destino = destino;
        this.relatorio = relatorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "id=" + id +
                ", veiculo='" + veiculo + '\'' +
                ", destino='" + destino + '\'' +
                ", relatorio='" + relatorio + '\'' +
                '}';
    }
}