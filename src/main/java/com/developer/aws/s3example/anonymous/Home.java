package com.developer.aws.s3example.anonymous;

public class Home {
    private String name;

    public Home(String name) {
        this.name = name;
    }

    public String process(Integer flag) {
        if (flag > 0) {
            return String.format("Es mayor '%s'", name);
        } else {
            return String.format("No cumple '%s'", name);
        }
    }

}
