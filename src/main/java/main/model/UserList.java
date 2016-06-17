package main.model;

import javax.persistence.Id;
/**
 * Created by admin on 2016-06-11.
 */

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@javax.persistence.Entity
public class UserList {

    @Id
    private String userid;
    private String name;
    private String password;
    private String desc;

//    @JoinColumn(name = "userinfo_id")
//    @OneToMany
//    private List<Comment> comments;

    public UserList(){};

    public UserList(String name, String password){

        super();
        this.name = name;
        this.password = password;
    }

    public String getuserId() {
        return userid;
    }

    public void setuserId(String id) {
        this.userid = id;
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
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

}