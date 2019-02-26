package com.learm.myself.springjpa.services;

import com.learm.myself.springjpa.UserDTO;

import java.util.List;

public interface UserServices {

    UserDTO findUserById(int id);

    void deleteUserDTOByName(String name);

    void saveUserDTO(UserDTO userDTO);

}
