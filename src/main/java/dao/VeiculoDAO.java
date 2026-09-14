package dao;

import conexao.Conexao;
import modelo.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import repositorio.VeiculoRepository;

public class VeiculoDAO implements VeiculoRepository {

    public void inserir(Veiculo veiculo) throws SQLException {

        String sql =
                "INSERT INTO veiculo (placa, marca, modelo) VALUES (?, ?, ?)";

        try (Connection con = Conexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getMarca());
            stmt.setString(3, veiculo.getModelo());

            stmt.executeUpdate();
        }
    }

    public List<Veiculo> listar() throws SQLException {

        List<Veiculo> veiculos = new ArrayList<>();

        String sql = "SELECT * FROM veiculo";

        try (Connection con = Conexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Veiculo veiculo = new Veiculo();

                veiculo.setId(rs.getInt("id"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));

                veiculos.add(veiculo);
            }
        }

        return veiculos;
    }
}