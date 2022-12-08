@echo off
set /p cname="class name?"
del %cname%.class
cls
javac -encoding utf8 %cname%.java
java %cname%