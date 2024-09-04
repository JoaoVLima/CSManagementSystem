import management.Atendimento;
import management.Solicitacao;
import structures.Fila;
import structures.Pilha;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws Exception {
        Pilha<Solicitacao> historicoSolicitacoes = new Pilha<Solicitacao>(50);
        Fila<Atendimento> ordemAtendimentos = new Fila<Atendimento>(50);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("======= MENU CSMSystem =======");
            System.out.println("Analista de Suporte");
            System.out.println("\t" + "1 - Adicionar Solicitação");
            System.out.println("Técnico de Suporte");
            System.out.println("\t" + "2 - Adicionar Atendimento");
            System.out.println("\t" + "3 - Efetuar Atendimento");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print("Descreva a Solicitação: ");
                String descricao = scanner.next();
                Solicitacao nova_solicitacao = new Solicitacao(UUID.randomUUID(), descricao, new Date());
                historicoSolicitacoes.insere(nova_solicitacao);
                historicoSolicitacoes.imprime();
            } else if (opcao == 2) {
                System.out.print("Nome do Cliente: ");
                String nome_cliente = scanner.next();
                System.out.print("Motivo do Atendimento: ");
                String motivo = scanner.next();
                Atendimento novo_atendimento = new Atendimento(UUID.randomUUID(), nome_cliente, motivo);
                ordemAtendimentos.insere(novo_atendimento);
                ordemAtendimentos.imprime();
            } else if (opcao == 3) {
                Atendimento atendimento_removido = ordemAtendimentos.remove();
                System.out.println(atendimento_removido);
            } else {
                continue;
            }
        }
    }
}
