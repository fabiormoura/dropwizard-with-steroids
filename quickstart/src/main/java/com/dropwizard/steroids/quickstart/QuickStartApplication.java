package com.dropwizard.steroids.quickstart;

import com.dropwizard.steroids.quickstart.hello.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class QuickStartApplication extends Application<QuickStartConfiguration> {
    public static void main(String[] args) throws Exception {
        new QuickStartApplication().run(args);
    }

    @Override
    public void run(QuickStartConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new HelloWorldResource());
    }
}
