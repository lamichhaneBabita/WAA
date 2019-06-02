package mum.edu.service;

import mum.edu.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> getAll();

    public User findByName(String name);

}
