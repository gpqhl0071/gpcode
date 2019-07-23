@echo off


rem if "%1"=="" goto end

SET /P comm=comment :

rem echo =========================git pull=============================
rem git pull
echo comm
echo =========================git commit=============================
git commit -am "%comm%"
echo =========================git push=============================
git push
echo =========================git status=============================
git status

:end
echo good bye