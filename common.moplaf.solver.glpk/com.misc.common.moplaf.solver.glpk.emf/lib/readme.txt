two components are needed glpk and glpk-java

glpk
  glpk must be installed somewhere
  - on a linux box
     package glpk provides the command line tool, installed as /usr/bin/glpsol
     package glpk-devel provides the librairies, installed as /usr/lib64/glpk.so
     package glpk-doc provides the doc, installed in /usr/doc/packages/glpk/* 

glpl-java
  package libglpk-java_1.0.31-2_amd64.deb got from somewhere
  - unpacked with command dpkg-deb -x
  - library glpk-java-1.0.31.jar moved into the bin folder (?)
  - binaries jni/libglpk_java.a/so in the jni folder must be loaded at runtime
  - made available from http://glpk-java.sourceforge.net/
  
  
  first aid
    if libglpk_java.so is not found, add its location to the env variable LD_LIBRARY_PATH in the run configurations
