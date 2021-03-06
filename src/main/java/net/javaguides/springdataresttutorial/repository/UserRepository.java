package net.javaguides.springdataresttutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.javaguides.springdataresttutorial.entity.User;

@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User,Long>{
        List<User> findByFirstName(@Param("firstName") String firstName);
        List<User> findByLastName(@Param("lastName") String lastName);
        List<User> findByEmail(@Param("email") String email);
}
