@echo off

set testng_basedir=D:\pnp\eclipse\eclipse4.4.0\plugins\org.testng.eclipse_6.9.11.201604020423\lib
set _cmd=java -cp .\classes;%testng_basedir%\testng.jar;%testng_basedir%\jcommander.jar;%testng_basedir%\bsh-2.0b4.jar;%testng_basedir%\snakeyaml.jar
set _cmd=%_cmd% org.testng.TestNG hellotestng.xml

rem echo %_cmd%
%_cmd%
