package mvn;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class carte {
	@DataProvider(name = "data")
    public Object[][] loginData() {
        try {
            FileInputStream fis= new FileInputStream("");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            Object[][] data = new Object[sheet.getLastRowNum()][3];

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                String email = row.getCell(0).getStringCellValue();
                String name= row.getCell(1).getStringCellValue();
                String message = row.getCell(2).getStringCellValue();
                data[i - 1][0] = email;
                data[i - 1][1] = name;
                data[i - 1][2] = message;
          
            }
            workbook.close();
            fis.close();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return new Object[0][0];
        }
    }

    // Test method that uses data provider
    @Test(dataProvider = "data")
    public void loginTest(String anu, String testing,String anur,String testin,String data) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

         // Initialize WebDriver
         WebDriver driver = new ChromeDriver();

         // Open the login page
         driver.get("");

         // Fill in the login form
         driver.findElement(By.xpath("")).sendKeys(anu);
         driver.findElement(By.xpath("")).sendKeys(testing);
         driver.findElement(By.xpath("")).sendKeys(anur);
      
       
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         // Close the browser
         driver.quit();
     }
 
    }




