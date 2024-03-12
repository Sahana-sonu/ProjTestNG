
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;

public class TestNGExample {
	    @BeforeMethod
		@BeforeTest
	        public void setUp() {
	    	        System.out.println("Before Test Execution"); }
	    
	        @Test(priority=1)
	            public void test1() {
	        	        System.out.println("Executing Test Case 1");    }
	        
	            @Test(priority=2)
	                public void test2() {
	            	        System.out.println("Executing Test Case 2");
	            }
	            
	                @Test(priority=3)
	                    public void test3() {
	                	        System.out.println("Executing Test Case 3");    }
	                
	                    @AfterMethod
						@AfterTest
	                        public void tearDown() {
	                    	        System.out.println("After Test Execution");    }


	    }
