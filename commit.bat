@echo off

rem if "%1"=="" goto end

set comm =
echo "%comm%"
SET /P comm=Please enter the submitted comment :

if "%comm%"=="" goto end

rem echo =========================git pull=============================
rem git pull
echo "%comm%"
echo =========================git commit=============================
git commit -am "%comm%"
echo =========================git push=============================
rem git push
echo =========================git status=============================
rem git status

:end
echo good bye
