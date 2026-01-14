import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Fide.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /en"

TrueTestScripts.navigate("/en")

"Step 2: Hover over button investments"

WebUI.mouseOver(findTestObject('AI-Generated/Fide/Page_en/button_investments'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over button investments.png')

"Step 3: Click on link sustainableInvestments -> Navigate to page '/en/investments/sustainable-investing'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en/link_sustainableInvestments'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link sustainableInvestments - Navigate to page eninvestmentssustainable-investing.png')

"Step 4: Click on link discoverSustainableInvesting -> Navigate to page '/en/insights/articles/five-ways-to-invest-sustainably'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_investments_sustainable_investing/link_discoverSustainableInvesting'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link discoverSustainableInvesting - Navigate to page eninsightsarticlesfive-ways-to-invest-sustainably.png')

"Step 5: Click on input emailAddress"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_insights_articles_five_ways_to_invest_sustainably/input_emailAddress'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input emailAddress.png')

"Step 6: Enter input value in input emailAddress"

WebUI.setText(findTestObject('AI-Generated/Fide/Page_en_insights_articles_five_ways_to_invest_sustainably/input_emailAddress'), input_emailAddress)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Enter input value in input emailAddress.png')

"Step 7: Click on input investorType"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_insights_articles_five_ways_to_invest_sustainably/input_investorType'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on input investorType.png')

"Step 8: Select option with input value from select investorTypeDescription"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Fide/Page_en_insights_articles_five_ways_to_invest_sustainably/select_investorTypeDescription'), select_investorTypeDescription)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Select option with input value from select investorTypeDescription.png')

"Step 9: Click on input investorOptIn"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_insights_articles_five_ways_to_invest_sustainably/input_investorOptIn'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input investorOptIn.png')

"Step 10: Click on button signUp"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_insights_articles_five_ways_to_invest_sustainably/button_signUp'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button signUp.png')

"Step 11: Click on link managementReportsOfFundPerformance -> Navigate to page '/en/financials'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_insights_articles_five_ways_to_invest_sustainably/link_managementReportsOfFundPerformance'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link managementReportsOfFundPerformance - Navigate to page enfinancials.png')

"Step 12: Click on link fidelityAllInOneBalancedEtf -> Navigate to page '/en/products/funds/abe'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_financials/link_fidelityAllInOneBalancedEtf'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link fidelityAllInOneBalancedEtf - Navigate to page enproductsfundsabe.png')

"Step 13: Click on button seriesB"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_products_funds_abe/button_seriesB'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button seriesB.png')

"Step 14: Click on link seriesF5"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_products_funds_abe/link_seriesF5'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link seriesF5.png')

"Step 15: Click on button nl"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_products_funds_abe/button_nl'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button nl.png')

"Step 16: Click on link getFundFacts -> Navigate to page '/en/fundfacts'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_products_funds_abe/link_getFundFacts'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on link getFundFacts - Navigate to page enfundfacts.png')

"Step 17: Click on button allSalesOptions"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_fundfacts/button_allSalesOptions'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button allSalesOptions.png')

"Step 18: Click on link aDscLlLl2"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_fundfacts/link_aDscLlLl2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on link aDscLlLl2.png')

"Step 19: Click on link pficEftstatements -> Navigate to page '/en/pfic etf statements'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_fundfacts/link_pficEftstatements'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on link pficEftstatements - Navigate to page enpfic etf statements.png')

"Step 20: Hover over button forAdvisors"

WebUI.mouseOver(findTestObject('AI-Generated/Fide/Page_en_pfic_etf_statements/button_forAdvisors'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Hover over button forAdvisors.png')

"Step 21: Click on link fundFacts -> Navigate to page '/en/fundfacts'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_pfic_etf_statements/link_fundFacts'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on link fundFacts - Navigate to page enfundfacts.png')

"Step 22: Click on link fidelityAdvancedUsequityFund -> Navigate to page '/en/products/funds/aeus'"

WebUI.enhancedClick(findTestObject('AI-Generated/Fide/Page_en_fundfacts/link_fidelityAdvancedUsequityFund'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on link fidelityAdvancedUsequityFund - Navigate to page enproductsfundsaeus.png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Sustainable Investments and Sign Up for Updates_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}