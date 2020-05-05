package repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface Userrepo extends MongoRepository<User, Integer> {

}
