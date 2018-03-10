package com.itheima.ssh01.dao;

import com.itheima.ssh01.domain.User;

/**  
 * ClassName:UserDao <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:53:49 <br/>       
 */
public interface UserDao {

    User findUserById(Integer id);

}
  
