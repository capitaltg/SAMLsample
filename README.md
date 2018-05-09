# SAMLsample  
  
A reference app that demonstrates combining Spring and Struts filters to SAML-enable a Struts application.  
  
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
