package com.learm.myself.springjpa.services;

import com.learm.myself.springjpa.DTO.UserDTO;

public interface UserServices {

    UserDTO findUserById(int id);

    void deleteUserDTOByName(String name);

    void saveUserDTO(UserDTO userDTO);

}
