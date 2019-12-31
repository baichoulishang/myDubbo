package controller;

import api.IRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Role;

import javax.annotation.Resource;

/**
 * @author 陈宜康
 * @date 2019/3/9 16:38
 * @forWhat
 */
@Controller("/myController")
@RequestMapping("/my")
public class MyController {

    @Resource
    private IRoleService roleService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        roleService.insertRole(new Role());

        modelAndView.setViewName("jsp/index.jsp");
        return modelAndView;
    }

}
