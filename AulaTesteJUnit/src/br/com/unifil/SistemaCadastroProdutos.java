package br.com.unifil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private double precoUnitario;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, String descricao, String categoria, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

public class SistemaCadastroProdutos {
    private static List<Produto> listaProdutos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
        	System.out.println("---------------------");
            System.out.println("Escolha uma opção:");           
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Editar Produto");
            System.out.println("3 - Excluir Produto");
            System.out.println("4 - Consultar Produtos");
            System.out.println("5 - Sair");
        	System.out.println("---------------------");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    editarProduto();
                    break;
                case 3:
                    excluirProduto();
                    break;
                case 4:
                    consultarProdutos();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarProduto() {
        System.out.println("Nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Descrição do produto:");
        String descricao = scanner.nextLine();

        System.out.println("Categoria do produto:");
        String categoria = scanner.nextLine();

        System.out.println("Preço unitário do produto:");
        double precoUnitario = scanner.nextDouble();

        System.out.println("Quantidade em estoque:");
        int quantidadeEstoque = scanner.nextInt();

        Produto novoProduto = new Produto(nome, descricao, categoria, precoUnitario, quantidadeEstoque);
        listaProdutos.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void editarProduto() {
        System.out.println("Digite o nome do produto que deseja editar:");
        String nome = scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.println("Digite o novo nome do produto:");
            produtoEncontrado.setNome(scanner.nextLine());

            System.out.println("Digite a nova descrição do produto:");
            produtoEncontrado.setDescricao(scanner.nextLine());

            System.out.println("Digite a nova categoria do produto:");
            produtoEncontrado.setCategoria(scanner.nextLine());

            System.out.println("Digite o novo preço unitário do produto:");
            produtoEncontrado.setPrecoUnitario(scanner.nextDouble());

            System.out.println("Digite a nova quantidade em estoque:");
            produtoEncontrado.setQuantidadeEstoque(scanner.nextInt());

            System.out.println("Produto editado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void excluirProduto() {
        System.out.println("Digite o nome do produto que deseja excluir:");
        String nome = scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            listaProdutos.remove(produtoEncontrado);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void consultarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            System.out.println("Lista de produtos cadastrados:");
            for (Produto produto : listaProdutos) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Preço Unitário: " + produto.getPrecoUnitario());
                System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
                System.out.println("-------------------------");
            }
        }
    }
}
