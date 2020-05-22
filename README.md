# Karros challenges
- The site to test: http://ktvn-test.s3-website.us-east-1.amazonaws.com/ 
- Log in account: admin@test.com/test123

## Automation Test Challenge:
- Provide the ONE XPath to return the requests which are submitted and approved in 2019 (Request Status = Approved && Date Submitted = 2019)
- Write the automation script to verify for 
  1. Verify filter Student Access Request with INACTIVE
  2. Verify sorting of First Name column 
  3. The API endpoint - GET https://my-json-server.typicode.com/typicode/demo/posts/1 

## Structure of scripts as following
- TC01_Login: for login purpose, do not validate anything 
- TC02_Verify filter Student Access Request with INACTIVE
   - **Steps:** Select Filter > Request Status = "Inactive" > click Apply Filter
   - **Validations:** 
        1. Selected Filter Option is "Inactive"
        2. Verify All Requests which "Request Status" = Inactive are returned, if not the test case is failed.
- TC03_Verify sorting of First Name
    1. Click sort icon on First Name > Verify that all First_Name values are descending order
    2. Click sort icon one more > Verify that all First_Name values are ascending order
- TC04_xPathApprovedRequestsin2019
    1. Provide ONE XPath to return the requests which are submitted and approved in 2019 in Reporter Log file
    2. Print out elements matched found by xpath in Reporter Log file
- TC05_API GET
   - **Validations:** 
     1. Status Code: 200
     2. Reponse Body
   - **Notes** the API endPoint has been changed to "https://my-json-server.typicode.com/lienmoon/karros-challenges/posts/1" 
        
# How to run the scripts:
1. Install Java https://www.java.com/en/download/ and config JAVA_HOME environment
2. Instal Maven https://maven.apache.org/install.html and config MAVEN_HOME environment 
3. Install Firefox (https://www.mozilla.org/en-US/exp/firefox/new/)
2. Clone the repo
2. Open Terminal and go to the project directory StudentRequests: $ cd to/the/project/folder
3. Enter command: $ mvn test

- **Notes** This is maven project, if the command line $mvn test is not working, so please help to install maven
- And make sure that the PATH environment should look like this /usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin:/root/bin:/Library/Java/JavaVirtualMachines/jdk1.8.0_251.jdk/Contents/Home/bin:/Users/[youruser]/.rvm/bin

## Check the outputs
- From the project folder, go to folder target/surefire-reports/index.html
- Open the file index.html, you can see the test result and logs
