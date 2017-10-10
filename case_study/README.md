## CASE STUDY

The cases are downloaded from Evosuite official website

```
http://www.evosuite.org/experimental-data/github-subjects/
```

and stored in this directory. Each case is used to test Evosuites.


To run EvoSuite and generate unit tests, go to each subdirectory and find the run.sh. Use the following command

```
./run.sh
```

This command generates EvoSuite tests and export them into /src/test/evosuite/ folder.

To run the unit test, run 

```
mvn test
```

and only the EvoSuite generated tests are executed.