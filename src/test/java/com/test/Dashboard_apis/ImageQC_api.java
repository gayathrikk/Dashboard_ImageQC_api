package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ImageQC_api {
	
	@Test(priority=1)
	public void ImageQC()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardImageQC");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the ImageQC failed. Status code: " + statusCode1);
        
        System.out.println("API request to the ImageQC passed. Status code: " + statusCode1);
	}
	@Test(priority=2)
    public void api_Imgaging_TODo()
           {
           Response response1 = RestAssured
                   .given()
                   .auth()
                   .basic("admin", "admin")
                   .when()
                   .get("https://apollo2.humanbrain.in/dashboard/queryImageQCBatchs/1");

           int statusCode1 = response1.getStatusCode();
           if (statusCode1 == 200) {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard Imaging_ToDo passed. Status code: " + statusCode1);
               System.out.println("_________________________******_______________________");
           } else {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard Imaging_ToDo. Status code: " + statusCode1);
           }
           Assert.assertEquals(statusCode1, 200, "API request to the Dashboard API request to the Dashboard Imaging_ToDo  failed");
           
       }
	@Test(priority=3)
	public void api_Scanning() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryImageQCBatchs/234");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Scanning Passed:"+ statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Scanning failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard API request to the Dashboard Imaging_Scanning failed");
         
     }
	@Test(priority=4)
	public void api_ImageQC() {
		 Response response1 = RestAssured
                .given()
                .auth()
                .basic("admin", "admin")
                .when()
                .get("https://apollo2.humanbrain.in/dashboard/queryImageQCBatchs/6");

        int statusCode2 = response1.getStatusCode();
        if (statusCode2 == 200) {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard Imaging_Image_QC passed. Status code: " + statusCode2);
            System.out.println("_________________________******_______________________");
        } else {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard Imaging_Image_QC   failed. Status code: " + statusCode2);
        }
        Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Imaging_Image_QC  failed");
        
    }
		
	@Test(priority=5)
	public void api_Bio_QC() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryImageQCBatchs/11");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Bio_QC passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Bio_QC  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Imaging_Bio_QC failed");
         
     }
	@Test(priority=6)
	public void api_Publishing() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryImageQCBatchs/7");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Publishing passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Publishing  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Imaging_Publishing failed");
         
     }
	@Test(priority=7)
	public void api_Batch_failed() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryImageQCBatchs/5");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Batch_failed passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Batch_failed  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Imaging_Batch_failed failed");
     }
	@Test(priority=7)
	public void api_Cryo_Out() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryImageQCBatchs/8");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Batch_Out passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Imaging_Batch_Out  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Imaging_Batch_Out failed");
     }

}
