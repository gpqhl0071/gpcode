@echo off


if "%1"=="" goto end

rem echo =========================git pull=============================
rem git pull
echo %1
echo =========================git commit=============================
git commit -am %1
echo =========================git push=============================
git push
echo =========================git status=============================
git status

:end
echo good bye