package ch.bfh.swos.bookapp.repository;

import ch.bfh.swos.bookapp.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, String>{
}
