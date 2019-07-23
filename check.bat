@echo off
rem author:peng
rem Integrated git checkout and git pull for push code during daily development, only for windows systems

rem if "%1"=="" goto end

SET /P comm=Please enter the branch :

if "%comm%"=="" goto end


echo "%comm%"
echo =========================git checkout=============================
git checkout "%comm%"
echo =========================git pull=============================
git pull
echo =========================git status=============================
git status

:end
echo good bye
