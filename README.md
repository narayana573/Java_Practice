# Selenium Webdriver Notes

##### How to Handel Dropdown list

```
WebElement mySelectElement = driver.findElement(By.id("mySelect"));
Select dropdown = new Select(mySelectElement);
Now to select an option from that dropdown, we can do it in either of the three ways:

dropdown.selectByVisibleText(“Bikes”); → Selecting an option by the text that is visible
dropdown.selectByIndex(“1”); → Selecting, by choosing the Index number of that option
dropdown.selectByValue(“option2”); → Selecting, by choosing the value of that option
```

##### How to Handel i frames

## iframe:
How to switch over the elements in iframes using Web Driver commands:

>By Index  -- driver.switchTo().frame(0);

>By Name or Id  -- driver.switchTo().frame("iframe1");

>By Web Element  -- driver.switchTo().frame(WebElement);

## How to switch over the frame, if we CANNOT switch using ID or Web Element:
```
public class IndexOfIframe {
 public static void main(String[] args) {
  WebDriver driver = new FirefoxDriver();
  driver.get("http://demo.guru99.com/test/guru99home/");
  driver.manage().window().maximize();
  //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  int size = driver.findElements(By.tagName("iframe")).size();

  for (int i = 0; i <= size; i++) {
   driver.switchTo().frame(i);
   int total = driver.findElements(By.xpath("html/body/a/img")).size();
   System.out.println(total);
   driver.switchTo().defaultContent();
  }
 }
}

```



##### How to handel Dynamic popup & Alert


## Alert
```
// Switching to Alert        
Alert alert = driver.switchTo().alert();    
// Capturing alert message.    
String alertMessage= driver.switchTo().alert().getText();   
// Displaying alert message   
System.out.println(alertMessage); 
Thread.sleep(5000);
// Accepting alert    
alert.accept();
// // Dismiss alert  
alert.dismiss();

```

## Popup

```
String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
String subWindowHandler = null;

Set<String> handles = driver.getWindowHandles(); // get all window handles
Iterator<String> iterator = handles.iterator();
while (iterator.hasNext()){
    subWindowHandler = iterator.next();
}
driver.switchTo().window(subWindowHandler); // switch to popup window

// Now you are in the popup window, perform necessary actions here

driver.switchTo().window(parentWindowHandler);  // switch back to parent window
```



##### How to Handel tables

```
public class RowandCell {
    public static void main(String[] args) throws ParseException {
      WebDriver wd;
    System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
     wd= new ChromeDriver();
     wd.get("http://demo.guru99.com/test/web-table-element.php"); 
     wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     WebElement baseTable = wd.findElement(By.tagName("table"));
      
     //To find third row of table
     WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
     System.out.println("Third row of table : "+rowtext);
        
        //to get 3rd row's 2nd column data
        WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        String valueIneed = cellIneed.getText();
        System.out.println("Cell value is : " + valueIneed); 
        wd.close();
    }
}
```

##### implicitlyWait & ExplicitWait
```
implicitlyWait
// Wait For Page To Load
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
```
```
ExplicitWait
WebDriverWait wait=new WebDriverWait(driver,20);
// Wait till the element is not visible
WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ur xpath here")));
```

##### Database connection 
##### Git Commands




###### Actions in Selenium Webdriver:

```
Actions actions = new Actions(driver);
```
###### Handel Drag & Drop:
```
 //To get source locator
 WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
  `              //To get target locator`
 WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
                //dragAndDrop(source, target) method accepts two parameters source and locator. 
                //used dragAndDrop method to drag and drop the source locator to target locator
 actions.dragAndDrop(sourceLocator, targetLocator).build().perform();
```
###### MoveToElement:
```
 WebElement mainMenu = driver.findElement(By.linkText("menulink"));
actions.moveToElement(mainMenu);
actions.sendKeys(Keys.TAB).build().perform();
```


## TestNG Annotations

```
@Test(groups={“Car”})
public void drive(){
system.out.println(“Driving the vehicle”);
}


@Test(dependsOnMethods={“drive”},groups={cars})
public void changeGear() {
system.out.println("Change Gears”);
}

@Test(threadPoolSize = 3, invocationCount = 10)
public void testServer() {
}
```