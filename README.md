## Building the Project

Build the project using Gradle:

```bash
./gradlew clean build
```

The build output `app.war` will be located in the `app/build/libs` directory.

## Extracting WAR Contents

To extract the contents of the WAR file:

```bash
jar -xvf app/build/libs/app.war
```

## Running the Development Server

Start a live development server using either `bunx` or `npx`:

```bash
bunx live-server app/build/libs --port=8080 --open=./app/build/libs/index.html

npx live-server app/build/libs --port=8080 --open=./app/build/libs/index.html
```
