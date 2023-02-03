package chapter23.socket02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;
	
	public MyServer() {
		try {
			//클라이언트가 접속할때 필요한 포트 번호를 반드시 지정해야하며
			//서비스 포트번호는 3000번대를 사용하는것이 일반적이다
			ss = new ServerSocket(3001); //서버 준비완료
			System.out.println("서버 시작");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new MyServer().start();
	}
	
	
	//Thread
	@Override
	public void run() {
		//접속자가 올때까지 기다림
		while(true) {
			try {
				Socket s = ss.accept(); //접속자를 받아들임
				BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msg = reader.readLine(); //접속자 메세지
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip+" : " + msg);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
