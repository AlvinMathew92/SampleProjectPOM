//package utilities;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestNGListener;
//import org.testng.ITestResult;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.Markup;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//
//public class TestListner implements ITestListener {
//	
//	private static ExtentReports extent=ExtentReportsUtils.createInstance();
//	private static ThreadLocal<ExtentTest> threadLocal=new ThreadLocal<ExtentTest>();
//
//	public void onFinish(ITestContext context) {
//		if(extent !=null) {
//			extent.flush();
//		}
//	}
//
//	public void onStart(ITestResult result) {
//		
//		
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestFailure(ITestResult result) {
//		// TODO Auto-generated method stub
//		//WebDriver driver=(()result.getInstance()).driver;
//	
//	}
//
//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		String onLogText="The test method ::: "+result.getMethod().getMethodName()+"Skippedd";
//		Markup m=MarkupHelper.createLabel(onLogText, ExtentColor.YELLOW);
//		threadLocal.get().log(Status.SKIP, m);
//		
//	}
//
//	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		ExtentTest test=extent.createTest(result.getTestClass().getName() +": : :"+result.getMethod().getMethodName());
//		threadLocal.set(test);
//		
//	}
//
//	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		String onLogText="The test method ::: "+result.getMethod().getMethodName()+"Successful";
//		Markup m=MarkupHelper.createLabel(onLogText, ExtentColor.GREEN);
//		threadLocal.get().log(Status.PASS, m);
//		
//	}
//	
//
//}
