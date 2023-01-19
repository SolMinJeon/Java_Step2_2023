package chapter11;

public class HttpServletMain {
	
	public static void method(HttpServlet httpservlet) {
		httpservlet.service();
	}

	public static void main(String[] args) {
		
		method(new FileDownloadService());
		method(new LoginService());
		
	}

}
