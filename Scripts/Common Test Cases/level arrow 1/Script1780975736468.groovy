import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Rectangle as Rectangle
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.callTestCase(findTestCase('Common Test Cases/Login Level Arrow - 01'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)

if (WebUI.getText(findTestObject('Page_Login/btn_Login')) == 'LoginABC') {
    WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)
} else {
    if (1 == 1) {
        WebUI.getText(findTestObjects('Page_Login/txt_Password')) == 'Password'

        if (2 == 2) {
            WebUI.callTestCase(findTestCases('Main Test Cases/Quick Test Failed - 0111'), [:], FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.callTestCase(findTestCases('Main Test Cases/Quick Test Failed - 0311'), [:], FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.setText(findTestObject('Page_Login/txt_Password'), Password)

            WebUI.click(findTestObject('Page_Login/btn_Login'))
        }
    }
    
    WebUI.callTestCase(findTestCase('Main Test Cases/Quick Test Failed - 0111'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('Main Test Cases/Quick Test Failed - 0111'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//landingPage = WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), GlobalVariable.G_Timeout)
WebUI.closeBrowser()

