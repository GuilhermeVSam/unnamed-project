# Etapa de build
FROM openjdk:21-jdk-slim AS build

WORKDIR /app

# Copia o wrapper e arquivos de configuração do Gradle
COPY gradlew build.gradle settings.gradle /app/
COPY gradle /app/gradle

# Concede permissão ao Gradle Wrapper
RUN chmod +x gradlew

# Define uma opção de limite de memória para o Gradle
ENV GRADLE_OPTS="-Xmx512m"

# Baixa as dependências e compila a aplicação
RUN ./gradlew build -x test --no-daemon

# Copia o código-fonte e realiza o build final
COPY src /app/src
RUN ./gradlew bootJar --no-daemon

# Etapa de produção
FROM openjdk:21-jdk-slim

WORKDIR /app

# Copia o JAR gerado na etapa de build
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

# Executa a aplicação Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
