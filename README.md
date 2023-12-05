﻿## Architecture

![img.png](img.png)

- Routing Server -> "Routing.wcf.server" c# project
- Proxy + Cache Server -> "JCDECAUX.wcf.server" c# project
- Heavy Client -> "HeavyClient" java project

## Requirements

- [Java 21](https://www.oracle.com/java/technologies/downloads/#java21) (in PATH)
- [Maven 3.8.1](https://maven.apache.org/download.cgi)
- Intellij IDEA
- Visual Studio with all the dependencies
- [Docker](https://www.docker.com/products/docker-desktop)
- [Docker Compose](https://docs.docker.com/compose/install/)
- Port 5672(rabbitmq), 15672(rabbitmq management), 8734(Routing.wcf.server), 8733(JCDECAUX.wcf.server) must be free on the host machine

## Build project

- Clone the project

### C#

- Open the project in Visual Studio (MiddlewareProject.sln)
- Build the solution in release mode
- The binaries will be generated in the bin folder of each project

### Java HeavyClient

- Open the "./HeavyClient" folder in Intellij IDEA
- run `mvn clean install`
- The binaries will be generated in the target folder(middleware-1.0-SNAPSHOT-shaded.jar)

### Packaging

- Launch package.bat
    - the C# binaries will be moved to the packaged folder (JCDECAUX.wcf.server\bin\Release\* ->
      packaged\JCDECAUX.wcf.server, Routing.wcf.server\bin\Release\* -> packaged\Routing.wcf.server)
    - the Java binaries will be moved to the packaged folder(HeavyClient\target\*-shaded.jar -> packaged\HeavyClient)

## Run project

### Manual

- Go to the packaged folder
- Launch rabbitmq with docker-compose
    - `docker-compose up -d --wait`
- Launch the C# JCDECAUX.wcf.server (JCDECAUX proxy server) (in a new privileged terminal)
    - `cd JCDECAUX.wcf.server`
    - `./JCDECAUX.wcf.server.exe`
- Launch the C# Routing.wcf.server (Routing server) (in a new privileged terminal)
    - `cd Routing.wcf.server`
    - `./Routing.wcf.server.exe`
- Launch the Java HeavyClient (in a new terminal)
    - `cd HeavyClient`
    - `java --module-path .\HeavyClient\javafx-sdk-21.0.1\lib --add-modules="javafx.controls,javafx.fxml" -jar .\HeavyClient\middleware-1.0-SNAPSHOT-shaded.jar`

### Automatic

- Go to the packaged folder
- Launch run.bat (double click on it)
    - The rabbitmq server will be launched with docker-compose
    - The C# JCDECAUX.wcf.server will be launched
    - The C# Routing.wcf.server will be launched
    - The Java HeavyClient will be launched