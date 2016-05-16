201604515
 downloaded from https://sourceforge.net/projects/lpsolve/?source=typ_redirect

run times dlls
https://sourceforge.net/projects/lpsolve/files/lpsolve/5.5.2.3/lp_solve_5.5.2.3_dev_ux64.tar.gz/download
  liblpsolve55.so

https://sourceforge.net/projects/lpsolve/files/lpsolve/5.5.2.3/lp_solve_5.5.2.3_java.zip/download
  liblpsolve55j.so
  lpsolve55j.jar
  
For some reason, liblpsolve55 is not found thanks to the osgi directive Bundle-NativeCode (I do not know why).
I guess it is because it is not loaded by osgi, but by the system run time.
Work around, add the path of its location into the env variable LD_LIBRARY_PATH.

Doc: http://lpsolve.sourceforge.net/5.5/

  
  
  
  
