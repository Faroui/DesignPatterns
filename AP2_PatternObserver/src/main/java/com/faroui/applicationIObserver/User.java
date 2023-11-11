package com.designpatterns.applicationIObserver;

public class User implements Observer1{
    private String name;
    private Channel channel=new Channel();

    public User(String name){
        this.name=name;
    }
    public void subscriberChannel(Channel ch){
            channel =ch;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name +" "+ message );
    }
}
