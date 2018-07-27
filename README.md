Welcome to your new Kafka Connect connector!

Add "mvn archetype:generate -DarchetypeGroupId=io.confluent.maven -DarchetypeArtifactId=kafka-connect-quickstart -DarchetypeVersion=0.10.0.0" for set up your maven quick start

# Running in development

```
mvn clean package
export CLASSPATH="$(find target/ -type f -name '*.jar'| grep '\-package' | tr '\n' ':')"
$CONFLUENT_HOME/bin/connect-standalone $CONFLUENT_HOME/etc/schema-registry/connect-avro-standalone.properties config/MySourceConnector.properties
```

