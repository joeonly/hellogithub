@echo off

rem set JAVA_HOME=D:\sdk\jdk1.6.0_24
set testng_basedir=D:\pnp\eclipse\eclipse4.4.0\plugins\org.testng.eclipse_6.9.11.201604020423\lib
set _cmd=%JAVA_HOME%\bin\javac -cp %testng_basedir%\testng.jar;%testng_basedir%\jcommander.jar;%testng_basedir%\bsh-2.0b4.jar;%testng_basedir%\snakeyaml.jar
set _cmd=%_cmd% -d classes -sourcepath src src\hello\HelloTestNG.java

echo %_cmd%
%_cmd%
