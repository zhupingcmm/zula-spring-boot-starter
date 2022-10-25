package com.mf.zulaspringbootstarter;

public class DemoService {


    private String demo;

    public DemoService(String demo) {
        this.demo = demo;
    }

    public String getService(){
        return demo;
    }
}

