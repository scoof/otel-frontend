FROM amazoncorretto:17-alpine

COPY target/otel-frontend-0.0.1-SNAPSHOT.jar /app.jar
COPY opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

CMD java -javaagent:/opentelemetry-javaagent.jar -Dotel.service.name=otel-frontend -Dotel.exporter.otlp.endpoint=http://opentelemetry-collector.opentelemetry.svc.cluster.local:4317 -Dotel.propagators=tracecontext,baggage,jaeger -jar /app.jar
