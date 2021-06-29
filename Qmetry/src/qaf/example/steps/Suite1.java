package qaf.example.steps;

import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import static com.qmetry.qaf.automation.step.CommonStep.*;


public class Suite1 extends WebDriverTestCase {
//static final Log logger=LogFactory.getLog(StepLib.class)
	@QAFTestStep(description = "Sample Test Scenario")
	public void testGoogleSearch() {
		get("http://www.google.com/");
		sendKeys("Git reporsitory QAF", "txt.searchbox");
		click("btn.search");
		verifyLinkWithPartialTextPresent("qaf");
	}
	
	@QAFTestStep(description = "Launch Google Application")
	public void launchURL() {
		String URL = ConfigurationManager.getBundle().getString("env.baseurl");
		get(URL);
/*		sendKeys("Git reporsitory QAF", "txt.searchbox");
		click("btn.search");
		verifyLinkWithPartialTextPresent("qaf");*/
	}
}
