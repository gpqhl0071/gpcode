@echo off


if "%1"=="" goto end

echo =========================git pull=============================
git pull
echo %1
echo =========================git commit=============================
git commit -am %1
echo =========================git push=============================
git push
echo =========================git status=============================
git status

:end
echo good bye