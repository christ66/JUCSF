package org.jenkinsci.plugins.JUCSF;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.BuildListener;
import hudson.model.FreeStyleProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.IOException;
import java.io.PrintStream;

@Extension
public class BeerBuilder extends Builder {
    public String name;

    @DataBoundConstructor
	public BeerBuilder(String name){
            this.name = name;
        }

    public BeerBuilder(){
        this("");
    }

    public boolean perform(AbstractBuild<?,?> build,
		    Launcher launcher,
		    BuildListener listener) throws IOException {
listener.annotate(new BeerAnnotation());
PrintStream console = listener.getLogger();
console.println("hello " + name);
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
