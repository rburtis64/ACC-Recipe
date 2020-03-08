package com.AnyoneCanCook.recipe.repositories;

import com.AnyoneCanCook.recipe.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
