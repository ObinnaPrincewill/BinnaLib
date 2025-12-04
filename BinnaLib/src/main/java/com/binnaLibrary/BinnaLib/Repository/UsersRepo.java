package com.binnaLibrary.BinnaLib.Repository;

import com.binnaLibrary.BinnaLib.Model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository <users, Integer> {

    users findByUsername(String Username);
}
