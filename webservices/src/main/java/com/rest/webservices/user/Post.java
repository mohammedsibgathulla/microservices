package com.rest.webservices.user;

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
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
