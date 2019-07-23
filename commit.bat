@echo off
git pull
echo %1
git commit -am %1
git push
git status
