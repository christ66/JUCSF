package org.jenkinsci.plugins.JUCSF;

import hudson.Extension;
import hudson.MarkupText;
import hudson.console.ConsoleAnnotator;
import hudson.console.ConsoleNote;

/**
 * @author stevenchristou
 *         Date: 10/23/14
 *         Time: 5:25 PM
 */
@Extension
public class BeerAnnotation extends ConsoleNote {
    @Override
    public ConsoleAnnotator annotate(
            Object context,
            MarkupText markupText,
            int textLocation) {
        String returnValue = "<p color=\"red\">";
        returnValue = returnValue + markupText.getText();
        returnValue = returnValue + "</p>";
        markupText.addMarkup(textLocation, returnValue);
        return null;
    }
}
