package com.shoppingbackend.Shopping.Website.repository;

import com.shoppingbackend.Shopping.Website.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<AppUser, UUID> {

    public AppUser findByEmail(String userEmail);
}
