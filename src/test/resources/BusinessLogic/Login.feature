Feature:Login Functionality
Background: user is on Flipkart main page and mouse over on login button
Given user open "Chrome" browser with exe "C:\\Selenium Support\\chromedriver.exe"
Given user enter "https://www.flipkart.com/" as url
Given user click on cancle button to close login window
Given user move on login button

@SmokeTest
Scenario:Login functionality with valid credentials
When user click on my profile
When user enter "9673028877" as username
When user enter "Admin@123" as password
When user click on login button
Then application shows profile to user
