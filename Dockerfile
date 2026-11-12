FROM maven:3.9-eclipse-temurin-8 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn -B -DskipTests package

COPY src ./src
RUN mvn -B package dependency:copy-dependencies -DincludeScope=runtime -DoutputDirectory=/app/target/dependency

FROM eclipse-temurin:8-jre

WORKDIR /app
COPY --from=build /app/target/classes ./classes
COPY --from=build /app/target/dependency ./dependency

ENTRYPOINT ["java", "-cp", "classes:dependency/*", "com.github.kennycyb.App"]
