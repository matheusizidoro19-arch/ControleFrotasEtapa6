package dao;

import conexao.Conexao;
import modelo.Viagem;
import repositorio.ViagemRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViagemDAO implements ViagemRepository {

    public void inserir(Viagem viagem) throws SQLException {

        String sql =
                "INSERT INTO viagem (veiculo, destino, relatorio) VALUES (?, ?, ?)";

        try (Connection con = Conexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, viagem.getVeiculo());
            stmt.setString(2, viagem.getDestino());
            stmt.setString(3, viagem.getRelatorio());

            stmt.executeUpdate();
        }
    }

    public List<Viagem> listar() throws SQLException {

        List<Viagem> viagens = new ArrayList<>();

        String sql = "SELECT * FROM viagem";

        try (Connection con = Conexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Viagem viagem = new Viagem();

                viagem.setId(rs.getInt("id"));
                viagem.setVeiculo(rs.getString("veiculo"));
                viagem.setDestino(rs.getString("destino"));
                viagem.setRelatorio(rs.getString("relatorio"));

                viagens.add(viagem);
            }
        }

        return viagens;
    }
}