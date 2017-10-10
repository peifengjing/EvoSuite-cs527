#!/bin/bash
echo "Validating Settings of Evosuite in POM ..."
mvn evosuite:help
echo "** Validating Pass **"

echo "Generate and Export Evosuite Unit Tests ..."
mvn evosuite:generate
mvn evosuite:export -DtargetFolder=src/test/evosuite
mvn evosuite:export
echo "** Evosuite Generation Complete **"

echo ""
echo "Next step: run 'mvn test'"
echo ""
