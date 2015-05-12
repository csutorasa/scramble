javac -classpath .;junit.jar Scrambler.java ScramblerTest.java
java -classpath .;junit.jar;hamcrest.jar org.junit.runner.JUnitCore ScramblerTest