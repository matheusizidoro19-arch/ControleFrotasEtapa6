package repositorio;

import java.sql.SQLException;
import java.util.List;
import modelo.Viagem;

public interface ViagemRepository {

    void inserir(Viagem viagem) throws SQLException;

    List<Viagem> listar() throws SQLException;
}