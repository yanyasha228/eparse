package com.ex.BParse.Services;

import com.ex.BParse.Models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void save(User user);

    void delete(User user);

}
