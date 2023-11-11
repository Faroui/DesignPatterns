package com.designpatterns.applicationIObserver;

public interface Subject1 {
    public void subsribe(Observer1 observer1);
    public void unsubscribe(Observer1 observer1);
    public void notifyAllSubsriber();
}
