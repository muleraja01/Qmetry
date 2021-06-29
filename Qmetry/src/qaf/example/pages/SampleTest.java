package qaf.example.pages;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SampleTest extends WebDriverTestCase {

	@Test
	public void testGoogleSearch() {
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
