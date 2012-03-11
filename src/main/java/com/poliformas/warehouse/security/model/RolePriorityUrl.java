package com.poliformas.warehouse.security.model;

public class RolePriorityUrl {

    private String _role;
    private String _urlLoginSuccess;
    private Integer _priority;

    public RolePriorityUrl(String role,String urlLoginSuccess, Integer priority){
        _role = role;
        _urlLoginSuccess = urlLoginSuccess;
        _priority = priority;
    }

    /**
     * @return the _role
     */
    public String getRole() {
        return _role;
    }

    /**
     * @param role the _role to set
     */
    public void setRole(String role) {
        this._role = role;
    }

    /**
     * @return the _urlLoginSuccess
     */
    public String getUrlLoginSuccess() {
        return _urlLoginSuccess;
    }

    /**
     * @param urlLoginSuccess the _urlLoginSuccess to set
     */
    public void setUrlLoginSuccess(String urlLoginSuccess) {
        this._urlLoginSuccess = urlLoginSuccess;
    }

    /**
     * @return the _priority
     */
    public Integer getPriority() {
        return _priority;
    }

    /**
     * @param priority the _priority to set
     */
    public void setPriority(Integer priority) {
        this._priority = priority;
    }
}
