# CodeChef Playground in Clojure

This is my personal playground project, to see if Clojure is a good choice 
of language for CodeChef. Turns out it is not:
* takes too long to run (you'll get ``Time Limit Exceeded``)
* also, seems most of (at least Beginner-type) problems are not really meant for functional style

## Usage

```lein uberjar```

Then, simply pass input via STDIN (seems how CodeChef works)

```
cd target
cat ../resources/input | java -jar codechef-0.1.0-SNAPSHOT-standalone.jar 
```