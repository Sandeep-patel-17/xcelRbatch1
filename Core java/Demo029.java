public class Demo029 {
    public static void main(String[] args) {
        String[] friendsNames = {"Uday", "Pranay", "Satish", "Sandeep", "karthik","Pramod","Sai","Ram","Ria","Priya"};
        long[] friendsPhones = {9876543210L, 9123456789L, 9988776655L, 9871234567L, 9998887776L,8008794023L,7854796514L,9876543210L,9123456789L,9988776655L};
        System.out.println("My friends' names and their phone numbers are:");
        for (int i = 0; i < friendsNames.length; i++) {
            System.out.println("Friend's name: " + friendsNames[i] + ", Phone number: " + friendsPhones[i]);
            
        }

        
    }
}
