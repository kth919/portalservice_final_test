package main.model;

import javax.persistence.*;

/**
 * Created by admin on 2016-06-11.
 */

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@javax.persistence.Entity
public class Userinfo {

    @Id
    private String userid;
    private String name;
    private String password;
    private String des;

//    @JoinColumn(name = "userinfo_id")
//    @OneToMany
//    private List<Comment> comments;


    public String getuserId() {
        return userid;
    }

    public void setuserId(String userId) {
        this.userid = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesc() {
        return des;
    }

    public void setDesc(String desc){
        this.des = desc;
    }

}