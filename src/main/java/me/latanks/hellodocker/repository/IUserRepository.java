package me.latanks.hellodocker.repository;


import me.latanks.hellodocker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
