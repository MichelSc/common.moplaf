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
  - on a ubuntu linux box 
       package libglpk40  (20200201)
         provides /usr/lib/x86_64-linux-gnu/libglpk.40(.3.0)
       package libglpk-java provides 
         usr/share/java/glpk-java(-1.11.0).jar but also the .so here above
         usr/share/x86_64-linux-gnu/jni/libglpk_java(...).so
         the present bundle provides the same

  the current version win (20180902) is upgraded to
    glpk 4.65 (this is version 40)
    glpk-java.dll  4.65
    glpk-java 1.11
  the current version lin (20200201) is upgraded to
    glpk 40.3.0
    glpk_java.so 40.2.3
    
  note about the glpk-java.jar to be used
    - the one shipped with the linux binaries (from ubuntu repositories) does not work with the windows libraries
    - the one shipped with the windows binaries (from sourceforge) do work with the linux libraries
    - so keep the one from the source forge   
  
  first aid
    if libglpk_java.so is not found, add its location to the env variable LD_LIBRARY_PATH in the run configurations
    if glpk_4_55.dll is not found, add it to the System32 folder
    I believe it is never found, because it is not loaded by OSGI
    
