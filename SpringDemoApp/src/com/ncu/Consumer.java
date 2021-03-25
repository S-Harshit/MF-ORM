package com.ncu;

public class Consumer {

    Iworker iw;

    Consumer(Iworker iw){
        this.iw=iw;
    }

    public void consumer() {
        iw.first();
    }

}