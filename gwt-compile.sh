#!/bin/bash
set -ev

java -cp ./target/classes:./src/main/java:./src/main/resources:$HOME/.m2/repository/com/google/gwt/gwt-user/2.7.0-SNAPSHOT/gwt-user-2.7.0-SNAPSHOT.jar:$HOME/.m2/repository/com/google/gwt/gwt-dev/2.7.0-SNAPSHOT/gwt-dev-2.7.0-SNAPSHOT.jar\
    com.google.gwt.dev.Compiler \
    -XnoclassMetadata -incrementalCompileWarnings -XnocheckCasts -XjsInteropMode JS -XclosureCompiler -draftCompile -style PRETTY -gen source  \
    com.workingflows.jquery.JQuery