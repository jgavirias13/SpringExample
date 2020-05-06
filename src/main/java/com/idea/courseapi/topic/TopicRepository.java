package com.idea.courseapi.topic;

import org.springframework.data.repository.CrudRepository;

// Crud repository, tipado con el tipo de objeto y el tipo del id del objeto
public interface TopicRepository extends CrudRepository<Topic, String> {

}
