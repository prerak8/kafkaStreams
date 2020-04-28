package repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.user;

@Repository
public interface Userrepo extends MongoRepository<user, Integer> {

}
