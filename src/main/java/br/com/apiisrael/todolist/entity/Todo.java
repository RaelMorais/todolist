package br.com.apiisrael.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// TODO é a classe onde é criado o banco de dados e seus atributos... Seria o model do Django 

// Mapeamento Objeto-Relacional (ORM): Entidade é o mapeamento do objeto relacional, que vai permitir conectar no banco de dados. 
@Entity // Marca Todo como uma entidade para ser manipulada no banco de dados 

// É usado o Hibernete para fazer manipulçao no banco; 
@Table(name = "Todos")
public class Todo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
    private String nome; 
    private String descricao; 
    private boolean realizado; 
    private int prioridade;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    public boolean isRealizado() {
        return realizado;
    }
    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    } 

}


