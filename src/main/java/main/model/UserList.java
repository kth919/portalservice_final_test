package main.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.naming.Name;
import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2016-06-11.
 */

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@javax.persistence.Entity
//@javax.persistence.Table(name ="user")
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