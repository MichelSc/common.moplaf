package com.misc.common.moplaf.rap.service.download;


import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.misc.common.moplaf.common.Plugin;

public class DownloadServiceHandler implements org.eclipse.rap.rwt.service.ServiceHandler {

	public DownloadServiceHandler() {
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	    String filename = request.getParameter( "data" );
        Path path = FileSystems.getDefault().getPath(filename);
	    
	    Plugin.INSTANCE.logInfo("DownloadServiceHandler: download"+filename);

	    // Send the file in the response
	    response.setContentType( "application/octet-stream" );
//	    response.setContentLength( download.length );
	    String contentDisposition = "attachment; filename=\"" + path.getFileName() + "\"";
	    response.setHeader( "Content-Disposition", contentDisposition );
	    
	    try (OutputStream out = response.getOutputStream()) {
	        Files.copy(path, out);
	        out.flush();
	    } catch (IOException e) {
		    Plugin.INSTANCE.logError("DownloadServiceHandler: exception"+e.getMessage());
	    }	
	}
}
