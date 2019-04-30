package com.learm.myself.springjpa.repositories;

import com.learm.myself.springjpa.DTO.UserDTO;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<UserDTO,Long> {

    @Query("select u from UserDTO u where u.id=:id")
    UserDTO findUserDTOById(@Param("id" ) int id);

    @Modifying
    @Query("delete from UserDTO u where u.name = :name")
    void deleteUserDTOSByName(@Param("name" ) String name);

}
