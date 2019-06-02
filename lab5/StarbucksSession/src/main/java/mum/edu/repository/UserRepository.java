package mum.edu.repository;

import mum.edu.domain.User;

import java.util.List;

public interface UserRepository {
    public List <User> getAll();
    public User findByName(String name);

}
