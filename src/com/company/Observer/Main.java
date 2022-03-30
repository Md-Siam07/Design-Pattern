package com.company.Observer;

public class Main {

    public static void main(String[] args){
        Subject siam = new Blogger("siam");
        Blogger subin = new Blogger("tamim shahriar subin");
        Follower inzamam = new Follower("inzamam");
        Follower jhalok = new Follower("jhalok");
        Follower rahat = new Follower("rahat");
        siam.subscribe(inzamam);
        siam.subscribe(jhalok);
        siam.subscribe(rahat);

        siam.notifyObservers("first blog");
        siam.unsubscribe(rahat);
        siam.notifyObservers("second blog");

        subin.subscribe(jhalok);
        subin.blogUpdate("third blog");
    }

}
