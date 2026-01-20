import com.atlassian.oai.validator.util.StringUtils
import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.webui.util.WebDriverCleanerUtil

import internal.GlobalVariable

class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()
	}
	
	@AfterTestCase
	def terminateRunningWebDrivers(TestCaseContext testCaseContext) {
		WebDriverCleanerUtil.cleanup()
	}
	
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		String testCaseID = testCaseContext.getTestCaseId()
		GlobalVariable.tcID = testCaseID
		
		// If test case need to be skipped
		if (testCaseID.contains('skipped')) {
			String seconds = testCaseID.split(" ").last()
			
			testCaseContext.skipThisTestCase()
			return
		}
	}
	
}