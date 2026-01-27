import org.apache.commons.lang3.StringUtils
import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.webui.util.WebDriverCleanerUtil
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class TestListener {
	
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		String testCaseID = testCaseContext.getTestCaseId()
		GlobalVariable.tcID = testCaseID
		
		// If test case need to be skipped
		if (testCaseID.contains('Skipped')) {
			String seconds = testCaseID.split(" ").last()
			
			// Delay before skip
			if (StringUtils.isNumeric(seconds)) {
				WebUI.delay(seconds.toInteger())
			}
			
			testCaseContext.skipThisTestCase()
			return
		}
	}
}