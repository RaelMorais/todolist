package br.com.apiisrael.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiisrael.todolist.entity.Todo;

public interface  TodoRepository extends JpaRepository<Todo, Long>{
    
}
