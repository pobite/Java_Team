public class User extends Person {
		
		private int userCode;
		
		public User() {
			
			super();		
		}
		
		
		public int getUserCode() {
			return userCode;
		}

		public void setUserCode(int newCode) {
			userCode = newCode;
		}
		
		
		//User에서 선택할 좀목 print하는 메소드 (모바일,랩탑,태블릿,이어폰,키보드,마우스) 3x2 형태로
		//public void Choose()
		
		
		//사용자에게 보여지는 옵션 항목
		public void optionDefault()
		{
			//색깔
			String[] SellerColor = new String[3];
			SellerColor[0] = "Blue";
			SellerColor[1] = "Red";
			SellerColor[2] = "Green";
			
			//용량
			int[] Sellercapacity = {64, 128, 512};
			
			//수량
			//SellerCount = Seller 재고관리의 수량 가져옴
			
		}
		
		
		//사용자가 입력한값을 저장후 주문내역으로 보내는 메소드
		public void optionUser(String color, int capacity, int count)
		{
			//입력값만큼 수량이 없을때 에러 출력하는 if문
			/*
			if(color || capacity || count> (Seller의 재고수량))
			{
				
			}
			*/
			
			
			//매개변수에 있는 값 Seller로 보내기
			
		}
		
	}


public class GPhone extends User
{
	private String GPhone1;
	private String GPhone2;
	private String GPhone3;
	
	
	//사용자에게 보여지는 mobile 종류 항목 default값
	public GPhone() {
		
		super();
		
		GPhone1 = null;
		GPhone2 = null;
		GPhone3 = null;
	}
	
	//이미지와 제품스펙 모두 프린트 하는 메소드 for문 
	
	//옵션 항목 for문으로 보여주는 메소드 User에서 optionDefault() 가져오기 
	
	//옵션 입력하는 메소드 User에서 optionUser()가져오기
}


public class GLaptop extends User
{
	
}

public class GTablet extends User
{
	
}

public class GKeyboard extends User
{
	
}

public class GMouse extends User
{
	
}

public class GEarphone extends User
{
	
}
