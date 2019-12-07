FROM openjdk:14-slim-buster
COPY build/libs/inventory-*-all.jar inventory.jar
EXPOSE 8080
CMD java -Dmicronaut.env.deduction=false -Dcom.sun.management.jmxremote ${JAVA_OPTS} -jar inventory.jar