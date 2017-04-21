package sdettraining.week3.day4;import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D4_001b_ReadDataFromExcel_ShoppingCart {

	 String strXLFilePath="C:\\Alienware\\841PM_0314\\SDET4\\HexTraWk3\\testData\\shoppingCartTestData.xls";
	 int xlNumOfRows;
	 int xlNumOfCols;
	 
	 String xlDataInLocalArray[][];
	
	
	@Test
	public void tc_shoppingCartTesting() throws Exception{
		
		String item2Search=null;
		String qty=null;
		String customerName=null;
		String customerCity=null;
		String customerState=null;
		String vCCNum=null;
		
		ReadDataFromExcel(strXLFilePath);
		
		String AUT_URL = "http://sdettraining.com/online";
		String runTestInBrowser="FF";
		WebDriver driver;
		
		
		/*
		System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://sdettraining.com/online");
		Thread.sleep(3000);
		*/
	for(int i=1; i<xlNumOfRows; i++){	
		
	
		item2Search=xlDataInLocalArray[i][0];;
		qty=xlDataInLocalArray[i][1];;
		customerName=xlDataInLocalArray[i][2];;
		customerCity=xlDataInLocalArray[i][3];;
		customerState=xlDataInLocalArray[i][4];;
		vCCNum = xlDataInLocalArray[i][5];
		
				driver = ReUsableFunctions.OpenBrowser(runTestInBrowser, AUT_URL);
				driver.findElement(By.name("txtSearch")).clear();
			    driver.findElement(By.name("txtSearch")).sendKeys(item2Search);
			    driver.findElement(By.id("Go")).click();
			    driver.findElement(By.xpath("html/body/font/table[1]/tbody/tr[2]/td[3]/a/img")).click();
			    driver.findElement(By.name("txtItemQty1")).clear();
			    driver.findElement(By.name("txtItemQty1")).sendKeys(qty);
			    driver.findElement(By.id("Recalc")).click();
			    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
			    
			    driver.findElement(By.name("txtCustomerName")).clear();
			    driver.findElement(By.name("txtCustomerName")).sendKeys(customerName);
			    driver.findElement(By.name("txtAddress")).clear();
			    driver.findElement(By.name("txtAddress")).sendKeys("123 Main Street");
			    driver.findElement(By.name("txtCity")).clear();
			    driver.findElement(By.name("txtCity")).sendKeys(customerCity);
			    driver.findElement(By.name("txtState")).clear();
			    driver.findElement(By.name("txtState")).sendKeys(customerState);
			    driver.findElement(By.name("txtZIP")).clear();
			    driver.findElement(By.name("txtZIP")).sendKeys("20121");
			    driver.findElement(By.name("txtPhone")).clear();
			    driver.findElement(By.name("txtPhone")).sendKeys("7035551414");
			    
			    
			    driver.findElement(By.name("optPaymentType")).click();
			    
			    
			    driver.findElement(By.name("txtAcctNo")).clear();
			    driver.findElement(By.name("txtAcctNo")).sendKeys(vCCNum);
			    Thread.sleep(3000);
			    
			    driver.findElement(By.name("txtCVV2No")).clear();
			    driver.findElement(By.name("txtCVV2No")).sendKeys("123");
			    driver.findElement(By.name("txtExpDate")).clear();
			    driver.findElement(By.name("txtExpDate")).sendKeys("02/2019");
			    driver.findElement(By.name("txtshipCustomerName")).clear();
			    driver.findElement(By.name("txtshipCustomerName")).sendKeys("Trump");
			    driver.findElement(By.name("txtshipAddress")).clear();
			    driver.findElement(By.name("txtshipAddress")).sendKeys("6 Pennsylvania Ave");
			    driver.findElement(By.name("txtshipCity")).clear();
			    driver.findElement(By.name("txtshipCity")).sendKeys("Washington");
			    driver.findElement(By.name("txtshipState")).clear();
			    driver.findElement(By.name("txtshipState")).sendKeys("DC");
			    driver.findElement(By.name("txtshipZIP")).clear();
			    driver.findElement(By.name("txtshipZIP")).sendKeys("20888");
			    driver.findElement(By.name("txtshipPhone")).clear();
			    driver.findElement(By.name("txtshipPhone")).sendKeys("2021114455");
			    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
			    String orderConfirmation =  driver.findElement(By.cssSelector("h2")).getText();
			 
				 System.out.println("Order Confirmation Message: " + orderConfirmation);
				 
				 System.out.println(orderConfirmation);
				 
				 if (orderConfirmation.equals("Thank you for ordering with us!")){
				        System.out.println("TEST PASSED");
					 }
				 else
				 {
					 System.out.println("TEST FAILED");
				 }
				 
				 driver.quit();
	 }
	}
	
	public void ReadDataFromExcel(String strXLFilePath) throws Exception{

        File xlFile = new File(strXLFilePath);
        FileInputStream TestDataStream = new FileInputStream(xlFile);

        HSSFWorkbook xlWorkBook = new HSSFWorkbook(TestDataStream);


        HSSFSheet xlSheet = xlWorkBook.getSheetAt(0);        // Referring to 1stsheet

        xlNumOfRows = xlSheet.getLastRowNum()+1;
        xlNumOfCols = xlSheet.getRow(0).getLastCellNum();


        System.out.println("------------------------------------------------");
        System.out.println("Total Number of Test-Data Rows are " +xlNumOfRows);
        System.out.println("Total Number of Test-Data Cols are " +xlNumOfCols);



        xlDataInLocalArray = new String[xlNumOfRows][xlNumOfCols];


     for (int i = 0; i < xlNumOfRows; i++) {
           HSSFRow row = xlSheet.getRow(i);
            for (int j = 0; j < xlNumOfCols; j++) {
               HSSFCell cell = row.getCell(j); // To read value fromeach col in each row
               String value = cellToString(cell);
               xlDataInLocalArray[i][j] = value;
          //     System.out.print(value);
          //     System.out.print("@@");
               }
            System.out.println();

        }


}



public static String cellToString(HSSFCell cell) {
        // This function will convert an object of type excel cell to a string value
        int type = cell.getCellType();
        Object result;
        switch (type) {
            case HSSFCell.CELL_TYPE_NUMERIC: //0
                result = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_STRING: //1
                result = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_FORMULA: //2
                throw new RuntimeException("We can't evaluateformulas in Java");
            case HSSFCell.CELL_TYPE_BLANK: //3
                result = "-";
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN: //4
                result = cell.getBooleanCellValue();
                break;
            case HSSFCell.CELL_TYPE_ERROR: //5
                throw new RuntimeException ("This cell has anerror");
            default:
                throw new RuntimeException("We don't support thiscell type: " + type);
        }
        return result.toString();
    } 
	
	
	
/*

//Writes to excel sheet

public void WriteDataToExcelFile(String fileName,ArrayList<String>strRateList) {

try {

System.out.println("inside write to excel method");


HSSFWorkbook myWorkBook = new HSSFWorkbook();

HSSFSheet xlSheet1 = myWorkBook.createSheet();

HSSFRow myRow;

HSSFCell myCell;


int listCounter = 0;

for(int row = 1; row < strRateList.size()+1; row++){

strRateFromList = strRateList.get(listCounter);



myRow = xlSheet1.createRow(0);

myCell = myRow.createCell(0);

//myCell.setCellStyle(style);

myCell.setCellValue("RESULTS");



myRow = xlSheet1.createRow(row);

myCell = myRow.createCell(0);

myCell.setCellValue(strRateFromList);

listCounter++;

}



FileOutputStream out = new FileOutputStream(fileName);

myWorkBook.write(out);

out.flush();

out.close();



strRateList.clear();

System.out.println("Check excel sheet: "+xlResultsDataFile +" for results");

System.out.println("END OF CODE");



} catch (Exception e) {

e.printStackTrace();

}


*/
}








