-------------------------------------------------------------------------------
Tutorials
-------------------------------------------------------------------------------
https://cdtdoug.ca/2014/04/21/tutorial-a-simple-approach-to-writing-javafx-eclipse-rcp-apps/

-------------------------------------------------------------------------------
system
-------------------------------------------------------------------------------
For openjdk on linux, install package openjfx.

-------------------------------------------------------------------------------
eclipse
-------------------------------------------------------------------------------
Install the IDE thing  from e(fx)clipse - http://download.eclipse.org/efxclipse/updates-released/3.6.0/site
  this is necessary: otherwise, the IDE does not find FXCanvas

-------------------------------------------------------------------------------
Build path

First step is to make the javafx packages visible to the JDT compiler. 
Of course, make sure the Execution Environment is set to JavaSE-8 and that it’s linked to the Oracle Java 8 JRE. 
In the project properties under Java Build Path, click on the Libraries tab and expand the JRE system library. 
Edit the access rules and add one that makes javafx/** Accessible.

Alternative is to import all the javafx libraries explicitly (this is deprecated)
-------------------------------------------------------------------------------
launch configuration
-------------------------------------------------------------------------------
Following plugins are required (are they?)
  org.eclipse.fx.ui.workbench3
  org.eclipse.fx.osgi

extra steps on windows
note that  jfxswt is on a different place (namely on the root of the JRE, and not in the ext subfolder)
1) The launch configuration, vm arguments  -Dosgi.framework.extensions=org.eclipse.fx.osgi
2) set the org.eclipse.fx.osgi jar next to the org.eclipse.osgi jar 
  copy it from <home>\.eclipse\org.eclipse.platform_4.6.1_968905197_win32_win32_x86_64\plugins

extra steps on linux
  set env var SWT_GTK3 to 0

Dont know when necessary
  org.eclipse.fx.javafx   
  org.eclipse.fx.osgi.util
	
The launch configuration, vm arguments
  -Dorg.osgi.framework.bundle.parent=ext  # more recent
  -Dosgi.framework.extensions=org.eclipse.fx.osgi # older

-------------------------------------------------------------------------------
problem Bundle org.eclipse.fx.osgi not found.
solution: move it to be next to org.eclipse.osgi jar
  - in the eclipse installation
  - in the target platform (folder home/.eclipse/org.eclipse.platform_n.n....

problem The import javafx.embed.swt cannot be resolved, FXCanvas cannot be resolved to a type
ship the plugin with jfxswt.jar in the lib folder and in the build path

------------------------------------------------------------------------------------
problem project not built, javafx... not found, fix build path
  solution: eclipse preferences, java, installed JRE's
    edit the JRE, add the libraries javafx-base/controls/graphics from /usr/share/java/

