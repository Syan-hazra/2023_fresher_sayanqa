# Amazon Website Automation Suite

#To run Amazon Automated Suite from command Line in the project Folder


## Packages Description

-com.maven_selenium.pages: Defining all the pages tests.


-com.maven_selenium.tests: Defining all the pages tests .

###Page.java and Test.java files description



***new release page and test :- search for new release and browse .

***Best seller page and test :-  go to best seller page and check one best selling product.
                          
***Login Page and Test :- All login test is tested & defined here.

***ProductSearch Page and Test :- Search for product in search bar.

***Register Page and Test :- Test for Register new user.


###BaseTest:The main class 
- @BeforeSuite - to open browser, to setExtent,
- @AfterSuite - to end endReport, to close browser
- @BeforeTest - to open the extent report
- @BeforeMethod - to open the browser, to open url
 




## Important Directory

- Drivers : ./drivers/chromedriver.exe
- Report File : ./Repositories/ExtentReports.html
 
- Configuration File: ./resources/Config.properties



## Main Parameters in Configuration.properties file
- global wait : to apply implicit wait
- URL : URL of Site
- Driver name : Name of browser
- Driver Address : Address of Driver



###Reports and Screenshots

- Extent report gets generated after the run under  ./Repositories/ExtentReport.html

