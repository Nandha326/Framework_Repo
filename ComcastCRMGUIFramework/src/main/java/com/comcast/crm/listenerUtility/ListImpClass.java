package com.comcast.crm.listenerUtility;
/**
 * @author Nandhakumar J
 */


import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpClass implements ITestListener,ISuiteListener{
	
		public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
			System.out.println("Report configuration");
	}
		public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
			System.out.println("Report Backup");
		}
		public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
			System.out.println("===== =====>"+result.getMethod().getMethodName()+">==========");
		
		}
		
		
		public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
			System.out.println("===== =====>"+result.getMethod().getMethodName()+">==========");
		}
	
		public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
			
			}
		
		
	
		public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		}
		
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
			
		}
		
		public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
		}
		 
		public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		}
		
		public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		}
}
