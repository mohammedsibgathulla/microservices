package com.rest.webservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Post {
    @Id
    @GeneratedValue
    private Integer id;
    private String description;
    //This will not retrieve the details of the user unless you call post.getUser();
    //Here when a post details are requested here it will go for recursion as post try to get the details of user and user will try to ge the details of user.
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
