# Quarkus Tracing Example


## Run

Start Jaeger server
```bash
docker run -d --name jaeger \
  -p 5778:5778 \
  -p 16686:16686 \
  -p 14268:14268 \
  jaegertracing/all-in-one:1.11

```

```bash
./mvnw clean package
java -jar target/tracing-example-1.0-SNAPSHOT-runner.jar
```

Compile to native code
```bash
./mvnw package -Pnative
```
