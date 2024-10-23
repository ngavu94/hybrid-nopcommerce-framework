package commons;

import java.io.File;

public class GlobalConstants {
    //System Infor
    public final static String PROJECT_PATH=System.getProperty("user.dir");
    public final static String OS_NAME=System.getProperty("os.name");

    //App infor user
    public final static String DEV_USER_URL="http://dev.techpanda.org/";
    public final static String STAGING_USER_URL="http://staging.techpanda.org/";
    public final static String LIVE_USER_URL="http://live.techpanda.org/";

    //App infor admin
    public final static String DEV_ADMIN_URL="http://dev.techpanda.org/index.php/backendlogin";
    public final static String STAGING_ADMIN_URL="http://staging.techpanda.org/index.php/backendlogin";
    public final static String LIVE_ADMIN_URL="http://live.techpanda.org/index.php/backendlogin";

    public final static String ADMIN_USERNAME="user01";
    public final static String ADMIN_PASSWORD="guru99com";

    //Wait infor
    public final static int SHORT_TIMEOUT=10;
    public final static int LONG_TIMEOUT=30;
    public final static int GLOBAL_TIMEOUT=15;

    //Download/ upload file
    public final static String SEPARATOR= File.separator;
    public final static String UPLOAD_PATH=PROJECT_PATH+SEPARATOR+ "uploadFiles"+SEPARATOR;
    public final static String DOWNLOAD_PATH=PROJECT_PATH+"/downloadFiles/";

    //Retry case fail
    public final static int RETRY_NUMBER=3;

    //Browser logs/extensions
    public final static String BROWSER_LOG_PATH=PROJECT_PATH+"/browserLogs/";
    public final static String BROWSER_EXTENSION_PATH=PROJECT_PATH+"/browserExtensions/";

    //html report folder
    public final static String REPORTING_PATH=PROJECT_PATH+ SEPARATOR+"htmlReportNG"+SEPARATOR;
    public final static String EXTENT_PATH=PROJECT_PATH+SEPARATOR+"htmlExtentReport"+SEPARATOR;
    public final static String ALLURE_PATH=PROJECT_PATH+"/htmlAllure/";

    //Data test environment
    public final static String DATA_TEST_PATH=PROJECT_PATH+"/dataTest/";
    public final static String ENVIRONMENT_CONFIG_PATH=PROJECT_PATH+"/environmentConfig/";

    public static final String JAVA_VERSION = System.getProperty("java.version");
}
