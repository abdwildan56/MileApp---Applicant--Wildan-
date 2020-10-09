import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://dev.mile.app/request-demo')

WebUI.waitForPageLoad(7, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Register Page/Fullname_field'), fullname)

WebUI.setText(findTestObject('Register Page/Email_field'), '')

WebUI.setText(findTestObject('Register Page/Phone_field'), phone)

WebUI.setText(findTestObject('Register Page/Company_field'), company)

WebUI.click(findTestObject('Register Page/SubmitBtn'))

WebUI.waitForElementVisible(findTestObject('Register Page/Error_messages'), 5)

WebUI.verifyElementText(findTestObject('Register Page/Error_messages'), 'The email field is required.', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

