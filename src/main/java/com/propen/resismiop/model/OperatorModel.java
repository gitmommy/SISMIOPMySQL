package com.propen.resismiop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Embeddable
public class OperatorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
    @Column(name = "role")
    private String role;

/*    @OneToOne(mappedBy = "manager")
    private UserModel user;
*/
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    /* 
    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }*/

//    @NotNull
//    @Column(name = "role")
//    private String role;
//
//    @OneToOne(mappedBy = "manager")
//    private UserRoleModel user;
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public UserModel getUser() {
//        return user;
//    }
//
//    public void setUser(UserModel user) {
//        this.user = user;
//    }
}
