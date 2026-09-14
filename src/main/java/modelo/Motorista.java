package modelo;

public class Motorista {

    private int id;
    private String nome;
    private String sobrenome;
    private String cnh;

    public Motorista() {
    }

    public Motorista(int id, String nome, String sobrenome, String cnh) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cnh = cnh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cnh='" + cnh + '\'' +
                '}';
    }
}