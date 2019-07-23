@echo off

rem if "%1"=="" goto end

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

set comm =
:end
echo good bye
