package com.poliformas.warehouse.security.service;

import java.util.List;

import com.poliformas.warehouse.integration.entity.Authority;

public interface AuthorityService {

    public List<Authority> getByUserKey(Integer userKey);

    public List<Authority> getByUserRolKey(Integer userRolKey);

    public void save(Authority Authority);

    public void delete(Authority Authority);

    public void update(Authority Authority);
}
