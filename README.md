# Calculator test project

The aim of this project is to provide a project where tests can be run and reported in the command line.

# Tests

This is a basic calculator class with two very basic methods.

The tests have been written in both JUnit5 and JGiven.

## Setting JAVA_HOME

You will need to ensure JAVA_HOME is set correctly.

## Gradle & test

Simply running `gradle test` in the command line will run the tests and `gradle test -i` will give more verbose output.

There is no need to install gradle as everything is packaged within this project.

Test output can be found in:

**Build folder**

You will find an HTML report in the folder:

`build/reports/index.html`

you will also find `XML` result output in the folder:

`build/test-results/test/TEST-CalculatorUnitTests.xml`

`build/test-results/test/TEST-CalculatorJgiven.xml`

**JGiven reports**

you will find a JSON report for JGiven output:

`jgiven-reports/TestCalculatorJgiven.json`

