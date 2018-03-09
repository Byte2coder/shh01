package com.itheima.ssh01.dao.Impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.ssh01.dao.UserDao;
import com.itheima.ssh01.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:54:19 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
          
         
        return getHibernateTemplate().get(User.class, id);
    }

}
  
