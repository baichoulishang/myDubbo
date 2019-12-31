package pojo;

import org.springframework.beans.factory.BeanNameAware;

import java.io.Serializable;

// @Alias("role")
public class Role implements Serializable, BeanNameAware {
    private String id;
    private String rolename;
    private String note;


    public Role() {
    }

    public Role(String id, String rolename, String note) {
        this.id = id;
        this.rolename = rolename;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public void setBeanName(String arg0) {
        System.out.println("【" + this.getClass().getSimpleName() + "】调用BeanNameAware接口的setBeanName方法");
    }
}
