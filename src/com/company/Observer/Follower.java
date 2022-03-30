package com.company.Observer;

public class Follower implements Observer{

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String bloggerName, String blogTitle) {
        System.out.println(followerName + " you may read the blog of: " + bloggerName + " and the blog title is: " + blogTitle);
    }
}
