# Serialize-Checker

serialize and deserialize tool for test different JVMs interoperability.

## Build

```
mvn package
```

executable-JAR

	target/serialize-checker-1.0-SNAPSHOT-jar-with-dependencies.jar

## Usage

### Serialize

```
java -jar serialize-checker-1.0-SNAPSHOT-jar-with-dependencies.jar save [filename]
```

### Deserialize

```
java -jar serialize-checker-1.0-SNAPSHOT-jar-with-dependencies.jar load [filename]
```