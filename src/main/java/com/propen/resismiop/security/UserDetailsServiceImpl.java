package com.propen.resismiop.security;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.propen.resismiop.model.UserModel;
import com.propen.resismiop.model.UserRoleModel;
import com.propen.resismiop.repository.UserDb;
/**
 * Created by Dimpecks on 4/10/2020.
 */

    @Service
    public class UserDetailsServiceImpl implements UserDetailsService {
        @Autowired
        private UserDb userDb;

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            UserRoleModel user = userDb.findByUsername(username);

            Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
            grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole()));

            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        }
    }




