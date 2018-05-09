# SAMLsample  
  
A reference app that demonstrates combining Spring and Struts filters to SAML-enable a Struts application.  
  
Testing instructions:
1. Add a definition to your hosts file for you localhost to be www.example.com
2. Run the application on port 8080 with a context-root of SAMLsample
3. Download the generated SP metadata from http://www.example.com:8080/SAMLsample/saml/metadata
4. Rename the downloaded spring_saml_metadata.xml file to a unique/random name and upload it to . http://www.testshib.org/register.html  
5. Go to http://www.example.com:8080/SAMLsample/ and click "Click Here to Login" (http://www.example.com:8080/SAMLsample/saml/login)  
6. Login using one of the sample names.  
  
**Files**
  
```
./src/main/resources/struts.xml
./src/main/resources/sp.jks (Service Provider keystore)
./src/main/resources/idp.xml (IDP XML metadata)
./src/main/resources/log4j.properties
./src/main/webapp/WEB-INF/index.jsp
./src/main/webapp/WEB-INF/web.xml
./src/main/webapp/WEB-INF/spring/securityContext.xml (Spring Security context)
./src/main/webapp/LoginForm.jsp
./src/main/webapp/LandingPage.jsp
./src/main/java/com/example/saml/userdetails/EmailUserDetails.java (Attribute mapping)
./src/main/java/com/example/saml/action/LandingPageAction.java
```
  
**Stock definitions**  
  
Spring SAML dependencies:  
https://github.com/capitaltg/SAMLsample/blob/master/pom.xml#L12-L66  
  
Custom class for mapping an email attribute to the nameid:  
https://github.com/capitaltg/SAMLsample/blob/master/src/main/java/com/example/saml/userdetails/EmailUserDetails.java  
  
web.xml definitions for Spring:  
https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/web.xml#L7-L28
  
Spring Security context:  
https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/spring/securityContext.xml  
  
**Minor customizations**

URLs to unprotect:  
https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/spring/securityContext.xml#L18-L23  
  
Service Provider key definition:
https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/spring/securityContext.xml#L37-L55  
  
IDP metadata XML file: https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/spring/securityContext.xml#L75  
IDP entityID: https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/spring/securityContext.xml#L90   
  
Base URL:  
https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/spring/securityContext.xml#L161  
Additional Base URL information for load balancer: 
https://github.com/capitaltg/SAMLsample/blob/master/src/main/webapp/WEB-INF/spring/securityContext.xml#L198-L204
