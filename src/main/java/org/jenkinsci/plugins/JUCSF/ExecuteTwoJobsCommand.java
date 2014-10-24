package org.jenkinsci.plugins.JUCSF;

import hudson.Extension;
import hudson.cli.CLICommand;
import hudson.model.AbstractProject;
import hudson.model.Item;
import org.kohsuke.args4j.Option;

/**
 * @author stevenchristou
 *         Date: 10/23/14
 *         Time: 5:59 PM
 */
@Extension
public class ExecuteTwoJobsCommand extends CLICommand {
    @Option(name = "--first", required = true, usage = "First job")
    public AbstractProject first;

    @Option(name = "--second", required = true, usage = "Second job")
    public AbstractProject second;

    @Override
    public String getShortDescription() {
        return "Execute two builds";
    }

    @Override
    protected int run() throws Exception {
        first.checkPermission(Item.BUILD);
        second.checkPermission(Item.BUILD);
        first.scheduleBuild2(0);
        second.scheduleBuild2(0);
        return 0;
    }
}
