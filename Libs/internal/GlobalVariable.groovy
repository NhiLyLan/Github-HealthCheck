package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile CellphoneMix : The domain of the application under test</p>
     */
    public static Object application_domain
     
    /**
     * <p>Profile CellphoneMix : The default query parameters of the URL</p>
     */
    public static Object query_params
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_SiteURL
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object Url_qa
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            application_domain = selectedVariables['application_domain']
            query_params = selectedVariables['query_params']
            G_Timeout = selectedVariables['G_Timeout']
            G_SiteURL = selectedVariables['G_SiteURL']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            Url_qa = selectedVariables['Url_qa']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
