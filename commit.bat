@echo off

if "%1"=="" echo ==============please write comment=====================

echo =========================git pull=============================
git pull
echo %1
echo =========================git commit=============================
git commit -am %1
echo =========================git push=============================
git push
echo =========================git status=============================
git status