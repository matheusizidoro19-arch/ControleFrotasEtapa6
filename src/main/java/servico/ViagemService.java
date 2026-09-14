package servico;

import modelo.Viagem;
import repositorio.ViagemRepository;

import java.sql.SQLException;
import java.util.List;

public class ViagemService {

    private final ViagemRepository viagemRepository;

    public ViagemService(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }

    public void cadastrar(Viagem viagem) throws SQLException {

        if (viagem == null) {
            throw new IllegalArgumentException("Viagem inválida.");
        }

        if (viagem.getVeiculo() == null || viagem.getVeiculo().isBlank()) {
            throw new IllegalArgumentException("O veículo deve ser informado.");
        }

        if (viagem.getDestino() == null || viagem.getDestino().isBlank()) {
            throw new IllegalArgumentException("O destino deve ser informado.");
        }

        if (viagem.getRelatorio() == null) {
            viagem.setRelatorio("");
        }

        viagemRepository.inserir(viagem);
    }

    public List<Viagem> listar() throws SQLException {
        return viagemRepository.listar();
    }
}