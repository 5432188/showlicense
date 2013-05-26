package com.thinkfree.showlicense;

public class LicensedProject {
    public String name;
    public String gav;
    public String projectUrl;
    public License license;
    public LicensedProject(String name, String gav, String projectUrl, License license) {
        this.name = name;
        this.gav = gav;
        this.projectUrl = projectUrl;
        this.license = license;
    }
}