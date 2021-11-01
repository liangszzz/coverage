package com.github.ls;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;


@Mojo(name = "test-coverage", defaultPhase = LifecyclePhase.TEST,
        requiresReports = true, threadSafe = true)
public class HelloMojo extends AbstractMojo {

    @Override
    public void execute() {
        System.out.println("######## test-coverage");
    }
}
