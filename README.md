# stack

Java Implementierung eines generischen Stacks als Teil des Lernblogs.

## Installation

[Gradle](https://gradle.org/):

```gradle
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    compile 'com.github.d-1815350400:stack:master-SNAPSHOT'
}
```

## Benutzung

```java
// erzeuge neuen Stapel
Stack<Integer> stack = new Stack<>();

// pruefe ob Stapel leer ist
stack.isEmpty(); // => true

// lege Element auf Stapel ab
stack.push(5);
stack.push(13);

// frage Groesse des Stapels ab
stack.size(); // => 2

// entferne oberstes Element
stack.pop(); // => 13

// frage oberstes Element ab ohne es zu entfernen
stack.top(); // => 5

stack.isEmpty(); // => false
```