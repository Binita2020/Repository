<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="Selenium Tests" verbose="3" parallel="tests"
    thread-count="1">
 
 
    <test name="Test1">
        <classes>
            <class name="TestGetClass" />
        </classes>
    </test>
</suite>