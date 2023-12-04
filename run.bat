@echo off

:: BatchGotAdmin
:-------------------------------------
REM  --> Check for permissions
    IF "%PROCESSOR_ARCHITECTURE%" EQU "amd64" (
>nul 2>&1 "%SYSTEMROOT%\SysWOW64\cacls.exe" "%SYSTEMROOT%\SysWOW64\config\system"
) ELSE (
>nul 2>&1 "%SYSTEMROOT%\system32\cacls.exe" "%SYSTEMROOT%\system32\config\system"
)

REM --> If error flag set, we do not have admin.
if '%errorlevel%' NEQ '0' (
    echo Requesting administrative privileges...
    goto UACPrompt
) else ( goto gotAdmin )

:UACPrompt
    echo Set UAC = CreateObject^("Shell.Application"^) > "%temp%\getadmin.vbs"
    set params= %*
    echo UAC.ShellExecute "cmd.exe", "/c ""%~s0"" %params:"=""%", "", "runas", 1 >> "%temp%\getadmin.vbs"

    "%temp%\getadmin.vbs"
    del "%temp%\getadmin.vbs"
    exit /B

:gotAdmin
    pushd "%CD%"
    CD /D "%~dp0"
:--------------------------------------    
docker-compose up -d
:: wait for the containers to be ready
timeout /t 15

start cmd.exe /c ".\JCDECAUX.wcf.server\bin\Debug\JCDECAUX.wcf.server.exe"
start cmd.exe /c ".\Routing.wcf.server\bin\Debug\Routing.wcf.server.exe"
start cmd.exe /c C:\Users\appad\.jdks\openjdk-21.0.1\bin\java.exe --module-path C:\Users\appad\Downloads\javafx-sdk-21.0.1\lib --add-modules="javafx.controls,javafx.fxml" -jar .\HeavyClient\target\middleware-1.0-SNAPSHOT-shaded.jar
