package service;

import api.IRoleService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import pojo.Role;

import java.util.List;

/**
 * @author 陈宜康
 * @date 2019/12/29 12:53
 * @forWhat
 */
@Service
public class RoleService implements IRoleService,
        BeanNameAware, BeanFactoryAware, InitializingBean {

    @Override
    public Role selectRole(String id) {
        Role role = new Role();
        role.setId("此时此刻");
        return role;

    }

    @Override
    public void insertRole(Role role) {
        System.out.println("执行了插入语句");
    }

    @Override
    public List<Role> getList(String rolename) {
        return null;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean被初始化了!!!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean被初始化了!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean被初始化了!!!");
    }
}
