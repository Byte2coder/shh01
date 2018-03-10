package com.itheima.ssh01.web;

import com.itheima.ssh01.domain.User;
import com.itheima.ssh01.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:56:03 <br/>       
 */

public class UserAction  extends ActionSupport implements ModelDriven<User> {

    private User model=new User();
    
    @Override
    public User getModel() {
          
        
        return model;
    }
    
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    private Integer id;
    public void setId(Integer id) {
        this.id = id;
    }
    

    public String findUserById(){
        System.out.println("0000");
        model= userService.findUserById(model.getId());
        return SUCCESS;
    }
    
    
    
}
  
