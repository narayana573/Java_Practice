# Selenium Webdriver Notes

##### How to Handel Dropdown list
##### How to Handel Popup & i frames
##### How to handel Dynamic popup
##### How to Handel tables

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


