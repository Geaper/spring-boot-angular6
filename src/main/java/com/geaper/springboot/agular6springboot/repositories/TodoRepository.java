package com.geaper.springboot.agular6springboot.repositories;

import com.geaper.springboot.agular6springboot.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
