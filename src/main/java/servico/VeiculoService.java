package servico;

import modelo.Veiculo;
import java.sql.SQLException;
import java.util.List;
import repositorio.VeiculoRepository;

public class VeiculoService {
private final VeiculoRepository veiculoRepository;

public VeiculoService(VeiculoRepository veiculoRepository) {
    this.veiculoRepository = veiculoRepository;
}

    public void cadastrar(Veiculo veiculo) throws SQLException {

        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo inválido.");
        }

        if (veiculo.getPlaca() == null || veiculo.getPlaca().isBlank()) {
            throw new IllegalArgumentException("A placa deve ser informada.");
        }

        if (veiculo.getMarca() == null || veiculo.getMarca().isBlank()) {
            throw new IllegalArgumentException("A marca deve ser informada.");
        }

        if (veiculo.getModelo() == null || veiculo.getModelo().isBlank()) {
            throw new IllegalArgumentException("O modelo deve ser informado.");
        }

        veiculoRepository.inserir(veiculo);
    }

    public List<Veiculo> listar() throws SQLException {
       return veiculoRepository.listar();
    }
}