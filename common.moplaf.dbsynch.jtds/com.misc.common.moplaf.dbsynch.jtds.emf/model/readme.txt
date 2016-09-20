see http://jtds.sourceforge.net/index.html

jdbc:jtds:<server_type>://<server>[:<port>][/<database>][;<property>=<value>[;...]]

 <server_type> is one of either 'sqlserver' or 'sybase'
 
 Class.forName("net.sourceforge.jtds.jdbc.Driver")
 
 in case of Connection refused exception
   - go in SQLServer configuration manager
     - check that tcpip is enabled
     - check that the port is right
 