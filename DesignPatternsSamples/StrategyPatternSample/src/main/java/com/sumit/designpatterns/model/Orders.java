package com.sumit.designpatterns.model;

import com.sumit.designpatterns.sample.PayStrategy;

public class Orders {
    private int totalCost;
    private boolean isClosed;

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}