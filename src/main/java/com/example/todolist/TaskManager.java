package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("Lista de tarefas vazia!");
        } else {
            tasks.stream().forEach(task -> {System.out.println(task);});
        }
    }

    public void removeTask(int index){
        if(index >= tasks.size() || index < 0){
            System.out.println("Indíce inválido");
        } else {
            tasks.remove(index);
        }
    }

    public void removeAllTasks(){
        tasks.clear();
    }

    public void updateTaskStatus(int index, String status){
        if(index >= tasks.size() || index < 0){
            tasks.get(index).setStatus(status);
            System.out.println("Status atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
