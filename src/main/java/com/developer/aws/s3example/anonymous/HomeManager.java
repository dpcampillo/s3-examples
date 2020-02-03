package com.developer.aws.s3example.anonymous;

public class HomeManager {

    public String example(Integer flag) {
        Home home = new Home("Home 01") {
            @Override
            public String process(Integer flag) {
                return "Esto es otra implementacion";
            }
        };
        return home.process(flag);
    }

}
