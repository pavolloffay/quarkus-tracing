# Quarkus Tracing Example

## Run
Start Jaeger server so we can receive some traces from Quarkus:
```bash
docker run -d --name jaeger \
  -p 5778:5778 \
  -p 16686:16686 \
  -p 14268:14268 \
  jaegertracing/all-in-one:1.11

```

Compile as a normal Java application:
```bash
./mvnw clean package
java -jar target/tracing-example-1.0-SNAPSHOT-runner.jar
```

Compile to native code requires installation of GraalVM.
Refer to the Quarkus or GraalVM documentation how to install it.
```bash
./mvnw package -Pnative
./target/tracing-example-1.0-SNAPSHOT-runner
```


Execute request:
```bash
curl -ivX GET localhost:8080/hello
curl -ivX GET localhost:8080/conversation
```
