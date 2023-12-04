package com.ctb.repositories;

import com.ctb.entities.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbUserRepository extends JpaRepository<DBUser,Integer> {

    public DBUser findByUsername(String username);
}
