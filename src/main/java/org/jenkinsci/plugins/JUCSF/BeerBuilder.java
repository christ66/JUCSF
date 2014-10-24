package org.jenkinsci.plugins.JUCSF;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.BuildListener;
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
}
