# roomCalculator
Modern app for modern people. 
Download the the java file, open cmd with admin rights and navigate to a folder where the app was downloaded. run javac with path to java file, (ex.: javac roomCalcApp.java), then run command java roomCalcApp.
Pre-requisites:
  1. Computer
  2. Operating System
  3. Access to internet
  4. JDK installed that can be downloaded from : https://www.oracle.com/java/technologies/javase-downloads.html
    a) windows: follow download link
    b) linux: use package manager (for ex: yum install openjdk), or use commpiled binaries depending on the architecture and distribution). 
    c) osx : please follow the guide for JDK 13 on OSX
I Extended info (Windows - assuming that JDK is installed):
1. add the path to your jdk to Path Variable in the system.
  a)open my computer or this pc - depends on version of OS
  b)rigth click and choose "properties"
  c)click on "advanced"
  d)click on "evnironment variables"
  e)in "system variables" section click on "edit"
  f)"new" and choose "browse"
  g)navigate to folder where JDK is installed and choose bin folder (for example: "C:\Program Files\Java\jdk-13.0.2\bin")
 2. download the file from git and compile it.
  a)open link "https://github.com/true-pigmaster/roomCalculator" in a browser
  b) find a button "clone or download"
  c) download the zip file
  d) navigate to downloaded zip file
  e) unpack only the java file "roomCalcApp.java"
  f) open cmd and run "javac roomCalcApp.java" it will create class file so it is good to have separate folder for java file
  g) if you have jre and jdk separately installed you should run java from jdk 
  example:
  C:\Users\User\Desktop>"c:\Program Files\Java\jdk-13.0.2\bin\java.exe" roomCalcApp
II Extended info (Linux - based  systems). 
 1. Make sure that JDK is installed  (for CENT OS:  "sudo yum list installed | grep jdk")
  a) if not install JDK through package manager, 
  b) create system var JAVA_HOME ("JAVA_HOME=/usr/lib/jvm/jre")
  c) open terminal and create folder (mkdir {folder name}, then cd to folder)
  d) git clone https://github.com/true-pigmaster/roomCalculator
  e) naviagate to roomCalculator/src/com/nttdata/roomCalculator
  f) execute "javac  roomCalcApp.java" and run app with "java  roomCalcApp".
 III Mac os extended info
  1) download the repository from git
  2) install jdk from https://www.oracle.com/java/technologies/javase-downloads.html
  3) set the java_home 
  4) run "javac roomCalcApp.java" and then "java -cp . roomCalcApp". 
also you can use git clone if you know how. 
This software comes with no warranty at all!. No baksies!
