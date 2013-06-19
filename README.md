feed-sample
===========
This is the source code for the Spring XD [custom source module example](https://github.com/SpringSource/spring-xd/wiki/Creating-a-Source-Module).

Running "mvn install" will produce a jar file that contains all the dependency jars
in a "lib" dir.  This jar file will be built to target/feed-1.0.0-BUILD-SNAPSHOT-full.jar.

*NOTE* currently Spring Bootstrap requires that packaged dependency jars be uncompressed.
This happens by default with Maven assembly plugin version 2.4 or higher (already specified in the pom).
Not sure if there is a way to change the compression in Gradle yet.

This jar can be used to test-drive the POC for loading modules from uberjars.
See [commit message](https://github.com/jencompgeek/spring-xd/commit/2bf436e64c06c34e69ea7b496b7e275123cc36c3) for more details.