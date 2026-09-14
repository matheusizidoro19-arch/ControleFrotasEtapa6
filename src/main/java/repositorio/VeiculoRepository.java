package repositorio;

import java.sql.SQLException;
import java.util.List;
import modelo.Veiculo;

public interface VeiculoRepository {

    void inserir(Veiculo veiculo) throws SQLException;

    List<Veiculo> listar() throws SQLException;
}