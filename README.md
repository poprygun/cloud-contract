 # Simple setup for Spring Cloud Contract
 
 ## In Producer project

Generate and upload stubs jar

```bash
 ./gradlew verifierStubsJar publishToMavenLocal
```

 ## In Consumer project

 Run tests against stubs generated in Producer project

```bash
./gradlew test
```