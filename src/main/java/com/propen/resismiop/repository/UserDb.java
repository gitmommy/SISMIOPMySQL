package com.propen.resismiop.repository;

import com.propen.resismiop.model.UserRoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDb extends JpaRepository<UserRoleModel, Long> {
    UserRoleModel findByUsername(String username);
    UserRoleModel findByPassword(String password);
}
