package com.wangrunxin.plugin.swagger.config;

import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.Set;

public class PackageGroup {

    @Parameter
    private Set<String> resourcePackages;

    @Parameter(defaultValue = "${project.build.directory}")
    private File outputDirectory;

    public File getOutputDirectory() {
        return outputDirectory;
    }

    public Set<String> getResourcePackages() {
        return resourcePackages;
    }
}
