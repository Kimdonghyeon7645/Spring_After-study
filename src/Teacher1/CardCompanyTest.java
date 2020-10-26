package Teacher1;

public class CardCompanyTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance();  //�̱��� ����
		
		Card myCard = company.createCard();   //�޼��忡�� Card ����
		Card yourCard = company.createCard();
		
		System.out.println("myCard ��ȣ   "+ myCard.getCardNumber());    //10001  ���
		System.out.println("yourCard ��ȣ   "+yourCard.getCardNumber());  //10002  ���
		
	}
}