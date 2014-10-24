package org.jenkinsci.plugins.JUCSF;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.BuildListener;
import hudson.model.FreeStyleProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.PrintStream;

@Extension
public class BeerBuilder extends Builder {
        @DataBoundConstructor
	public BeerBuilder(){}

    public boolean perform(AbstractBuild<?,?> build,
		    Launcher launcher,
		    BuildListener listener) {

PrintStream console = listener.getLogger();
console.println("hello JUC");
return true;
    }

    @Extension
    public static class DescriptorImpl
            extends BuildStepDescriptor<Builder> {

        @Override
        public boolean isApplicable(Class aClass) {
            return true;
        }

        @Override
        public String getDisplayName() {
            return "Beer builder";
        }
    }
}
