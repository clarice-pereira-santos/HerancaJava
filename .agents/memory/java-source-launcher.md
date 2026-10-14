---
name: Java source launcher
description: Compile package-based Java programs in the HerancaJava project.
---

For programs that import local package classes, compile the entry point and package sources together with `javac -d out`, then run the class using `java -cp out <ClassName>`. Do not assume `java main.java` will discover and compile imported sibling `.java` files.

**Why:** The source-file launcher compiled the entry point without the project's `modelos.Pessoa` source, causing “package does not exist” even though that source file was present.

**How to apply:** Keep the project workflow and manual run instructions using the same `javac` + classpath flow whenever the Java program uses classes in local packages.
