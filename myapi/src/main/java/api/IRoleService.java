package api;

import pojo.Role;

import java.util.List;

public interface IRoleService {
    Role selectRole(String id);

    void insertRole(Role role);

    List<Role> getList(String rolename);

}
