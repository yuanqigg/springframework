package com.learm.myself.springjpa.services.impl;

import com.learm.myself.springjpa.DTO.UserDTO;
import com.learm.myself.springjpa.repositories.UserRepository;
import com.learm.myself.springjpa.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO findUserById(int id) {
        return userRepository.findUserDTOById(id);
    }

    @Override
    @Transactional
    public void deleteUserDTOByName(String name) {
        userRepository.deleteUserDTOSByName(name);
        throw new UnsupportedOperationException();
    }

    @Override
    public void saveUserDTO(UserDTO userDTO) {
        userRepository.save(userDTO);
    }
}
