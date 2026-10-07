import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: Guilherme Silva de Oliveira");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;

        questoes.add(new Questao(
                "1) Em qual esporte o futevôlei teve sua origem?",
                "Brasil",
                "Argentina",
                "Portugal",
                "Espanha",
                'A'));

        questoes.add(new Questao(
                "2) Qual parte do corpo é proibida de ser usada para tocar a bola no futevôlei?",
                "Pé",
                "Cabeça",
                "Mão",
                "Peito",
                'C'));

        questoes.add(new Questao(
                "3) Em qual ambiente o futevôlei é tradicionalmente praticado?",
                "Quadra de areia",
                "Campo de grama",
                "Quadra de basquete",
                "Piscina",
                'A'));

        questoes.add(new Questao(
                "4) Qual jogador brasileiro é considerado um dos grandes nomes da história do futevôlei?",
                "Pelé",
                "Didi",
                "Renan Gamp",
                "Cafu",
                'C'));

        questoes.add(new Questao(
                "5) Quantos jogadores formam uma dupla no futevôlei?",
                "1 jogador",
                "2 jogadores",
                "3 jogadores",
                "4 jogadores",
                'B'));

        questoes.add(new Questao(
                "6) Qual objeto divide os dois lados da quadra de futevôlei?",
                "Trave",
                "Rede",
                "Cesta",
                "Barreira",
                'B'));

        questoes.add(new Questao(
                "7) Qual fundamento do futebol é bastante utilizado no futevôlei?",
                "Passe com os pés",
                "Arremesso com as mãos",
                "Drible com as mãos",
                "Bloqueio com os braços",
                'A'));

        questoes.add(new Questao(
                "8) Em uma partida de futevôlei, qual jogador pode utilizar a cabeça para tocar na bola?",
                "Somente o jogador da direita",
                "Somente o jogador da esquerda",
                "Qualquer jogador",
                "Nenhum jogador",
                'C'));

        questoes.add(new Questao(
                "9) Qual destes fundamentos pode ser utilizado para iniciar uma jogada no futevôlei?",
                "Saque",
                "Arremesso lateral",
                "Enterrada",
                "Escanteio",
                'A'));

        questoes.add(new Questao(
                "10) O futevôlei combina principalmente elementos de quais esportes?",
                "Futebol e vôlei",
                "Basquete e tênis",
                "Handebol e futebol",
                "Tênis e natação",
                'A'));

        questoes.add(new Questao(
                "11) Qual parte do corpo é muito utilizada para dominar a bola no futevôlei?",
                "Pé",
                "Mão",
                "Pulso",
                "Antebraço",
                'A'));

        questoes.add(new Questao(
                "12) Onde o futevôlei se tornou especialmente popular no Brasil?",
                "Nas praias",
                "Nas pistas de atletismo",
                "Nos ginásios de basquete",
                "Nos campos de golfe",
                'A'));

        questoes.add(new Questao(
                "13) Qual destes movimentos é comum no futevôlei?",
                "Cabeceio",
                "Arremesso",
                "Cortada com a mão",
                "Saque com a mão",
                'A'));

        questoes.add(new Questao(
                "14) No futevôlei, a bola deve passar por cima de qual objeto?",
                "Trave",
                "Rede",
                "Banco",
                "Cesta",
                'B'));

        questoes.add(new Questao(
                "15) Qual habilidade é importante para um jogador de futevôlei?",
                "Controle de bola",
                "Uso obrigatório das mãos",
                "Arremesso de longa distância",
                "Drible com as mãos",
                'A'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();

            System.out.println("Qual a sua resposta: ");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada!");
            }

            System.out.println();
        }

        System.out.println("Foram " + acertos + " acertos");

        double porcentagem = ((acertos * 100.0) / questoes.size());

        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);

        scanner.close();

        System.out.println("Obrigado por participar do quiz!");
    }
}