package chapter22;

import java.util.Random;

public class Runners {

	public void name() {
		
		int[] playerRandom = new int[5];
		String[] playerJump = {"","","","",""};
		boolean finish = false;
		int finishPlayer = 0;
	
		while(true) {
			//도약거리
			for(int i=0; i<playerRandom.length; i++) {
				playerRandom[i] = new Random().nextInt(4);
			}
			
			//0.1
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//각 선수에게 도약거리 적용
			for(int i=0; i<playerJump.length; i++) {
				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += "";
					break;
				case 1:
					playerJump[i] += " ";
					break;
				case 2:
					playerJump[i] += "  ";
					break;
				case 3:
					playerJump[i] += "   ";
					break;
				case 4:
					playerJump[i] += "    ";
					break;
	
				default:
					break;
				}
			}
			//달리기
			/*
			for(int i=0;i<playerJump.length;i++) {
				System.out.println((i+1) + "번 선수 |" + playerJump[i] + "🏃" + " 거리 : " + playerRandom[i]);
			   
			}*/
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<playerJump.length;i++) {
				System.out.print(playerJump[i]);
				System.out.println(i+1+"🏃");
				
				if(playerJump[i].length() >= 50) {
					finishPlayer = i+1;
					finish = true;
				}
			}
			//결산
			if(finish) {
				System.out.println("-----------------------------------------------------");
				System.out.println("WINNER - " + finishPlayer);
				break;
			}
		}
	}
}
