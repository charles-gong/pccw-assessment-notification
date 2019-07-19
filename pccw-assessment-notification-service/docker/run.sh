#!bin/bash
java -jar fakeSMTP-2.0.jar -s -b -p 25 -a 127.0.0.1 &
java -jar app.jar
