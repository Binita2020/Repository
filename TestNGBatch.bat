cd C:\Users\BinitaRawat\Desktop\binita\Workspace\ProjectJavaGit
set ProjectPath=C:\Users\BinitaRawat\Desktop\binita\Workspace\ProjectJavaGit
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml
pause