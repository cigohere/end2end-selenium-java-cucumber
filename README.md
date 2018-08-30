## What is this?

This repository is used for automated smoke test and functional test of web application.

	• Based on: selenium-java-cucumber - web application BDD test
	
## How do I get set up?

**Install JVM**
 
1. Download JDK: http://download.oracle.com/otn-pub/java/jdk/8u181-b13/96a7b8442fe848ef90c96a2fad6ed6d1/jdk-8u181-macosx-x64.dmg
     
2. Install JDK
     
3. Config JAVA_HOME: add “export JAVA_HOME=/Library/Java/Home” to your /.bash_profile
     
**Install Maven**
 
1. Download Maven: http://mirrors.viethosting.com/apache/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.zip
	
2. Create a new folder( Ex: /Users/shopback/opt)
	
3. Unzip apache-maven-3.5.4-bin.zip to /opt folder
	 
4. Config M2_HOME: 
	
   `Add the below lines to your /.bash_profile`
	
   `export M2_HOME=/Users/shopback/opt/apache-maven-3.5.4/bin`
   
   `export MAVEN_OPTS="-Xms1024m -Xmx1G -XX:PermSize=1024m -noverify"`
   
   `export PATH=$M2_HOME:$PATH`
			
**Install WebDriver**

1. Download Chrome WebDriver: https://chromedriver.storage.googleapis.com/index.html?path=2.41/
	
2. Unzip chromedriver_mac64.zip to /opt/Webdriver folder
   
3. Config WebDriver PATH:
   
   `Add the below lines to your /.bash_profile`
   
   `export WD=/Users/shopback/opt/webdriver`
   
   `export PATH=$WD:$PATH`
			
**Install setting.xml**
	
1. Create .m2 folder (Ex: /Users/shopback/.m2)

2. Cd to “/Users/shopback/.m2”, then create setting.xml file

3. Update setting.xml file to get Maven dependencies

	`<?xml version="1.0" encoding="UTF-8"?>
	<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
	<pluginGroups>
	</pluginGroups>
	<proxies>
	</proxies>
	<servers>
	</servers>
	<mirrors>
	</mirrors>
	<profiles>
	</profiles>
	</settings>`
			
## How do I execute test?

1. Update account for Needle login

	Cd to src/main/resource, then update your Needle account with email and password to Config.xml

2. Run Test

	To run all test(features file) in Chrome browser:
	
	Cd `qa-web` workspace, then run the below command:

	`mvn clean install`
