two components are needed glpk and glpk-java

glpk
  glpk must be installed somewhere
  - on a suse linux box 
     package glpk provides the command line tool
       installed as /usr/bin/glpsol
     package glpk-devel 
       provides the librairies, installed as /usr/lib64/glpk.so 
       this present bundle depends on this library
     package glpk-doc provides the doc
       installed in /usr/doc/packages/glpk/*
     package libglpk-java_1.0.31-2_amd64.deb got from somewhere
       - unpacked with command dpkg-deb -x
       - library glpk-java-1.0.31.jar moved into the lib folder
       - binaries jni/libglpk_java.a/so in the jni folder must be loaded at runtime
       - made available from http://glpk-java.sourceforge.net/
        
  - on a ubuntu linux box 
       package libglpk36 
         provides /usr/lib/x86_64-linux-gnu/libglpk.36(.1.2)
       package libglpk-java provides 
         usr/share/java/glpk-java(-1.0.37).jar but also the .so here above
         usr/share/x86_64-linux-gnu/jni/libglpk_java(...).so
         the present bundle provides the same

  the current version is upgraded to
    glpk 4.55 (this is version 36)
    glpk-java 1.0.37
  
  first aid
    if libglpk_java.so is not found, add its location to the env variable LD_LIBRARY_PATH in the run configurations
