package api.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    String repName;

    public ExtentTest test;
    public void onStart(ITestContext testContext){
        String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
        repName="Test-report"+timeStamp+".html";
        sparkReporter=new ExtentSparkReporter(".\\reports\\"+repName); //location of report
        sparkReporter.config().setDocumentTitle("RestAssureedAutomationProject");//Title of report
        sparkReporter.config().setReportName("Pet Store Users API");//name of report
        sparkReporter.config().setTheme(Theme.DARK);

        extent=new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application","Pet Store Users API");
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("user","NaDuc");
    }


    public void onTestSuccess(ITestResult result) {
        test=extent.createTest(result.getName());
        test.createNode(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.PASS,"Test Passed");
    }


    public void onTestFailure(ITestResult result) {
        test=extent.createTest(result.getName());
        test.createNode(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL,"Test Failed");
        test.log(Status.FAIL, result.getThrowable().getMessage());
    }
    public void onTestSkipped(ITestResult result) {
        test=extent.createTest(result.getName());
        test.createNode(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.SKIP,"Test Skipped");
        test.log(Status.SKIP, result.getThrowable().getMessage());
    }


    public void onFinish(ITestContext context) {
        extent.flush();
    }
}