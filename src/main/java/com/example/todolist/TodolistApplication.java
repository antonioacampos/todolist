package com.example.todolist;

import java.util.Scanner;

public class TodolistApplication {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Atualizar status de tarefa");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Limpar lista");
            System.out.println("0. Sair");

            System.out.println("Digite a opção desejada: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nDigite o título: ");
                    String titulo = scanner.nextLine();
                    System.out.println("\nDigite a descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.println("\nDigite o status atual (pendente, em andamento, concluída): ");
                    String status = scanner.nextLine();
                    System.out.println("\nDigite o prazo: ");
                    String deadline = scanner.nextLine();

                    Task task = new Task(titulo, descricao, status, deadline);
                    manager.addTask(task);
                    break;
                    case 2:
                        manager.listTasks();
                        break;
                    case 3:
                        System.out.println("Digite o índice da tarefa: ");
                        int idUpdate = scanner.nextInt() - 1;
                        System.out.println("\nDigite o novo status da tarefa: ");
                        String statusUpdate = scanner.nextLine();
                        manager.updateTaskStatus(idUpdate, statusUpdate);
                        break;
                    case 4:
                        System.out.println("Digite o índice da tarefa: ");
                        int idRemove = scanner.nextInt() - 1;
                        manager.removeTask(idRemove);
                        break;
                    case 5:
                        System.out.println("Confirmar limpeza da lista de tarefas (S/n): ");
                        String confirmar = scanner.nextLine();
                        if (confirmar.equals("S")) {
                            manager.removeAllTasks();
                        } else {
                            System.out.println("Limpeza cancelada.");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        scanner.close();
                    default:
                        System.out.println("Opção inválida");
            }
        }
    }

}
