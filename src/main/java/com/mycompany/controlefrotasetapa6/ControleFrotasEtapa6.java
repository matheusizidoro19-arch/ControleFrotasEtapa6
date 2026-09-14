package com.mycompany.controlefrotasetapa6;

import dao.MotoristaDAO;
import dao.VeiculoDAO;
import dao.ViagemDAO;

import modelo.Motorista;
import modelo.Veiculo;
import modelo.Viagem;

import servico.MotoristaService;
import servico.VeiculoService;
import servico.ViagemService;

public class ControleFrotasEtapa6 {

    public static void main(String[] args) {

        try {

            VeiculoService veiculoService =
                    new VeiculoService(new VeiculoDAO());

            MotoristaService motoristaService =
                    new MotoristaService(new MotoristaDAO());

            ViagemService viagemService =
                    new ViagemService(new ViagemDAO());

            System.out.println("=== VEÍCULOS ===");

            for (Veiculo veiculo : veiculoService.listar()) {
                System.out.println(veiculo);
            }

            System.out.println("\n=== MOTORISTAS ===");

            for (Motorista motorista : motoristaService.listar()) {
                System.out.println(motorista);
            }

            System.out.println("\n=== VIAGENS ===");

            for (Viagem viagem : viagemService.listar()) {
                System.out.println(viagem);
            }

            System.out.println("\nTodos os testes foram realizados com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro durante os testes:");
            System.out.println(e.getMessage());
        }
    }
}