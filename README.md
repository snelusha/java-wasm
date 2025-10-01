## Building the Project

Build the project using Gradle:

```bash
./gradlew clean build
```

The build output `app.war` will be located in the `app/build/libs` directory.

## Extracting WAR Contents

To extract the contents of the WAR file:

```bash
cd app/build/libs
jar -xvf app.war
```

## Running the Development Server

Start a live development server using either `bunx` or `npx`:

```bash
bunx live-server .

npx live-server .
```
