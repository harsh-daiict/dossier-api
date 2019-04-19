gradle clean jar
#mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=local"
java -jar -Dspring.profiles.active=local target/dossier-0.0.1-SNAPSHOT.jar
