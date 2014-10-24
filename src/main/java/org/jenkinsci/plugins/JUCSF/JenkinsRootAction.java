package org.jenkinsci.plugins.JUCSF;

import hudson.model.RootAction;
import hudson.Extension;

@Extension
public class JenkinsRootAction implements RootAction {
  public String getIconFileName() {
    return "/jenkins/images/logo.png";
  }
  public String getDisplayName() {
    return "Jenkins Home Page";
  }
  public String getUrlName() {
    return "http://jenkins-ci.org";
  }
}
