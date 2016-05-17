
download:
http://www.zib.de/berthold/scip/download.html old version
http://scip.zib.de/#download current version, download 20160517

documentation:
http://scip.zib.de/doc/html/
http://scip.zib.de/doc/html/JNI_INTERFACE.php


// getting started
First you have to create a SCIP object via SCIPcreate(), then you start to build the problem via 
SCIPcreateProb(). Then you create variables via SCIPcreateVar() and add them to the problem via 
SCIPaddVar().

The same has to be done for the constraints. For example, if you want to fill in the rows of a 
general MIP, you have to call SCIPcreateConsLinear(), SCIPaddConsLinear() and additionally 
SCIPreleaseCons() after finishing. If all variables and constraints are present, you can initiate 
the solution process via SCIPsolve().

Make sure to also call SCIPreleaseVar() if you do not need the variable pointer anymore. For 
an explanation of creating and releasing objects, please see the doxygen documentation.

