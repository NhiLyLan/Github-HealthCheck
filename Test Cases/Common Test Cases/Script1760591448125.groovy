import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.logging.LogType as LogType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//EventFiringWebDriver driver = DriverFactory.getWebDriver()
//WebDriver wrappedDriver = driver.getWrappedDriver()
//
//if (wrappedDriver.class == CRemoteWebDriver) {
//	println wrappedDriver.getCapabilities().getCapability("browserName")
//}
WebUI.callTestCase(findTestCase('Common/Web App/Log In to Heroku Demo Cura'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('visualImage')

//try {
//	CustomKeywords.'katalon.cloudian.utilities.FileUtility.writeSeleniumWebDriverLogToReports'('seleniumPerfLogs.txt', LogType.PERFORMANCE)
//} catch (Throwable ex) {
//	println 'Cannot write selenium logs to Reports'
//}
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject123('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '12/07/2050')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), text)

WebUI.scrollToElement(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 0)

CustomKeywords.'katalon.cloudian.utilities.WebElementUtility.clickByJS'(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    'failed')

