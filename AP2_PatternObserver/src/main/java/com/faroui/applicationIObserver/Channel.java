package com.designpatterns.applicationIObserver;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject1{
    private String channelName;
    private  String notification;
    List<Observer1> observer1List;
    public Channel(){};
    public Channel(String channelName){
        this.channelName=channelName;
        observer1List = new ArrayList<>();
    }
    public List<Observer1> getObserver1List(){
        return observer1List;
    }
    @Override
    public void subsribe(Observer1 observer1) {
        observer1List.add(observer1);
    }

    @Override
    public void unsubscribe(Observer1 observer1) {
        observer1List.remove(observer1);
    }

    @Override
    public void notifyAllSubsriber() {
        for (Observer1 observer1:observer1List){
            observer1.update(notification);
        }

    }

    public void setNotification (boolean notif){
        notification = this.channelName +" Channel Has " + (notif?"New Notification":"No Notification");
        notifyAllSubsriber();
    }
}
