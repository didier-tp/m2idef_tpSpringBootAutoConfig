cd /d "%~dp0"
git init
git add *
git commit -a -m "version initiale"
git remote add gitHubOriginTpSpringBootAutoConfig https://didier-tp:password@github.com/didier-tp/m2idef_tpSpringBootAutoConfig.git
git push -u gitHubOriginTpSpringBootAutoConfig master
pause

REM open with text editor
REM opne with system editor