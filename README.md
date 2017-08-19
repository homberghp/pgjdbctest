
To trigger the error do the following.
. Build the application with maven, java 8 or 9 does not matter.
. Run the app with java 9. I use `java -jar target/bin/PGJDBCTimeUtilsTest-1.0-SNAPSHOT-jar-with-dependencies.jar`

output will be:

``` sh
    WARNING: An illegal reflective access operation has occurred 
    WARNING: Illegal reflective access by org.postgresql.jdbc.TimestampUtils (file:/home/hom/NetBeansProjects/PGJDBCTimeUtilsTest/target/bin/PGJDBCTimeUtilsTest-1.0-SNAPSHOT-jar-with-dependencies.jar) to field java.util.TimeZone.defaultTimeZone 
    WARNING: Please consider reporting this to the maintainers of org.postgresql.jdbc.TimestampUtils
    WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
    WARNING: All illegal access operations will be denied in a future release
```


My setup:
Date 2017-08-19

```sh
Apache Maven 3.3.9
Maven home: /usr/share/maven
Java version: 1.8.0_144, vendor: Oracle Corporation
Java home: /usr/lib/jvm/java-8-oracle/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "4.10.0-32-generic", arch: "amd64", family: "unix"
java version "9"
Java(TM) SE Runtime Environment (build 9+181)
Java HotSpot(TM) 64-Bit Server VM (build 9+181, mixed mode)
```