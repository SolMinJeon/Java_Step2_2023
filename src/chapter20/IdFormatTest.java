package chapter20;

public class IdFormatTest {

	private String userID;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IdFormatException {

		if(userID == null) {
			throw new IdFormatException("아이디는 null일수 없습니다");
		} else if(userID.length() < 8 || userID.length() > 20) {
			throw new IdFormatException("아이디는 9글자 이상 20글자 이하로 쓰세요");
		} 
		
		this.userID = userID;
	}



	public static void main(String[] args) {
		
		IdFormatTest test = new IdFormatTest();
		
		String userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IdFormatException e) {
			System.out.println(e); //코드와 메세지
			System.out.println(e.getMessage()); //메세지만 출력
		}

	}

}
