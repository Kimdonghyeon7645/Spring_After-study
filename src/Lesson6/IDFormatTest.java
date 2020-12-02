package Lesson6;

public class IDFormatTest {

    private String userID = "default";

    public void setUserID(String userID) throws IDFormatException {

        if(userID == null) {
            throw new IDFormatException("아이디는 null 일 수 없습니다!");
        }
        else if(userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상, 20자 이하로 쓰세요!");
        }
        this.userID = userID;

    }

    public String getUserID() {
        return userID;
    }

    public static void main(String[] args) {

        IDFormatTest idTest = new IDFormatTest();
        String[] myIds = {null, "아이디1입니다!", "새로운아이디"};


        for(String myId: myIds) {
            try {
                idTest.setUserID(myId);
            } catch (IDFormatException e) {
                System.out.println(e);;
            } finally {
                System.out.println(idTest.getUserID());
            }
        }
    }
}
