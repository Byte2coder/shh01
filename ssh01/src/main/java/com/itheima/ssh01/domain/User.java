package com.itheima.ssh01.domain;  
/**  
 * ClassName:User <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:50:06 <br/>       
 */
public class User {
    private Integer  id;
    private String username;
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
  
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
  
