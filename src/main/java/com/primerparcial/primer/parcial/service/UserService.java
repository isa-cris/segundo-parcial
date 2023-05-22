package com.primerparcial.primer.parcial.service;

import com.primerparcial.primer.parcial.model.Car;
import com.primerparcial.primer.parcial.model.User;
import java.util.List;

public interface UserService {
    User getUser(Long id);
    Boolean createUser (User user);
    List<User> alluser();
    Boolean updateUser(Long id, User user);
    String login (User user);
    Boolean deleteUser(Long id, User user);
}