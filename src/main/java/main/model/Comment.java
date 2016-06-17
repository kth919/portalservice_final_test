package main.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;


/**
 * Created by admin on 2016-06-12.
 */
public class Comment {

    private Integer id;
    private User user;
    private String content;

    @CreatedDate
    private Date dateCreated = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

}
