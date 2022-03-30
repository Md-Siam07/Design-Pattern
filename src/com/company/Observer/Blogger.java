package com.company.Observer;

import java.util.ArrayList;
import java.util.List;

public class Blogger implements Subject{

    private String bloggerName;
    private List<Observer> followers;

    public Blogger(String bloggerName) {
        this.bloggerName = bloggerName;
        followers = new ArrayList();
    }

    @Override
    public void subscribe(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer follower: followers){
            follower.update(bloggerName,message);
        }
    }

    public void blogUpdate(String blogTitle){
        System.out.println(bloggerName + " has uploaded " + blogTitle);
        notifyObservers(blogTitle);
    }
}
