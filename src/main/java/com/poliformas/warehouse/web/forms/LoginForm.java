package com.poliformas.warehouse.web.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.poliformas.warehouse.integration.entity.AbstractModel;

public class LoginForm extends AbstractModel{

    
    
    private String userName;
    
    
    private String password;

    @Size(min=1, max=25)
    @NotNull
    private String j_username;
    @Size(min=1, max=25)
    @NotNull
    private String j_password;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the assword
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the assword to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the j_username
     */
    public String getJ_username() {
        return j_username;
    }

    /**
     * @param j_username the j_username to set
     */
    public void setJ_username(String j_username) {
        this.j_username = j_username;
    }

    /**
     * @return the j_password
     */
    public String getJ_password() {
        return j_password;
    }

    /**
     * @param j_password the j_password to set
     */
    public void setJ_password(String j_password) {
        this.j_password = j_password;
    }
}

