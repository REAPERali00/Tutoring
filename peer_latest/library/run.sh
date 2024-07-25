#!/bin/bash

# Function to run the main application
main() {
  echo "Running main application..."
  mvn exec:java -Dexec.mainClass="system.App"
}

# Function to run the tests
test() {
  echo "Running tests..."
  mvn test
}

main
# test
