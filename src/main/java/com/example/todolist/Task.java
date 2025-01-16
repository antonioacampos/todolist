package com.example.todolist;

public class Task {
    private String title;
    private String description;
    private String status;
    private String deadline;

    public Task(String title, String description, String status, String deadline) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
    }

    public String getTitle() {return title;}
    public String getDescription() {return description;}
    public String getStatus() {return status;}
    public String getDeadline() {return deadline;}

    public void setTitle(String title) {this.title = title;}
    public void setDescription(String description) {this.description = description;}
    public void setStatus(String status) {this.status = status;}
    public void setDeadline(String deadline) {this.deadline = deadline;}

    @Override
    public String toString() {
        return "Título: " + title + ", Descrição: " + description +
                ", Status: " + status + ", Deadline: " + deadline;
    }
}
