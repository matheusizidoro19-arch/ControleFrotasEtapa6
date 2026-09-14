package repositorio;

import java.sql.SQLException;
import java.util.List;
import modelo.Motorista;

public interface MotoristaRepository {

    void inserir(Motorista motorista) throws SQLException;

    List<Motorista> listar() throws SQLException;
}