package dao;

import conexao.Conexao;
import modelo.Motorista;
import repositorio.MotoristaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MotoristaDAO implements MotoristaRepository {

    public void inserir(Motorista motorista) throws SQLException {

        String sql =
                "INSERT INTO motorista (nome, sobrenome, cnh) VALUES (?, ?, ?)";

        try (Connection con = Conexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getSobrenome());
            stmt.setString(3, motorista.getCnh());

            stmt.executeUpdate();
        }
    }

    public List<Motorista> listar() throws SQLException {

        List<Motorista> motoristas = new ArrayList<>();

        String sql = "SELECT * FROM motorista";

        try (Connection con = Conexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Motorista motorista = new Motorista();

                motorista.setId(rs.getInt("id"));
                motorista.setNome(rs.getString("nome"));
                motorista.setSobrenome(rs.getString("sobrenome"));
                motorista.setCnh(rs.getString("cnh"));

                motoristas.add(motorista);
            }
        }

        return motoristas;
    }
}