package servico;

import modelo.Motorista;
import repositorio.MotoristaRepository;

import java.sql.SQLException;
import java.util.List;

public class MotoristaService {

    private final MotoristaRepository motoristaRepository;

    public MotoristaService(MotoristaRepository motoristaRepository) {
        this.motoristaRepository = motoristaRepository;
    }

    public void cadastrar(Motorista motorista) throws SQLException {

        if (motorista == null) {
            throw new IllegalArgumentException("Motorista inválido.");
        }

        if (motorista.getNome() == null || motorista.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome deve ser informado.");
        }

        if (motorista.getSobrenome() == null || motorista.getSobrenome().isBlank()) {
            throw new IllegalArgumentException("O sobrenome deve ser informado.");
        }

        if (motorista.getCnh() == null || motorista.getCnh().isBlank()) {
            throw new IllegalArgumentException("A CNH deve ser informada.");
        }

        motoristaRepository.inserir(motorista);
    }

    public List<Motorista> listar() throws SQLException {
        return motoristaRepository.listar();
    }
}