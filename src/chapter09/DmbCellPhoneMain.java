package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellPhone dcp = new DmbCellPhone("Java폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필트를뿌
		System.out.println("모델 : "+dcp.model);
		System.out.println("색상 : "+dcp.color);
		System.out.println("-------------------------");
		
		//DmbCellPhone필드
		System.out.println("채널 : "+dcp.channel);
		
		System.out.println("-------------------------");
		
		//CellPhone의 메소드를 사용항 통화
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.reciveVoice("안녕!! 점심은 뭐먹을까?");
		dcp.sendVoice("아무거나");
		dcp.hangUp();
		dcp.powerOff();
		System.out.println("-------------------------");
		
		//DmbCellPhone의 메소드를 사용항 채널을 바꾸기
		dcp.turnOnDmb();
		dcp.changeChannel(5);
		dcp.turnOffDmb();
		System.out.println("-------------------------");

	}

}
