public class TestMan {

    public static final String[] validName =new String[]{"C0220I","A0220K","P0220L"};
    public static final String[] invalidName =new String[]{"B0220I","D0220K","P0220C"};

    public static void main(String[] args) {

        RegexPractice regexPractice = new RegexPractice();
        for (String name : validName){
            boolean isValid = regexPractice.valid(name);
            System.out.println("Name is "+name+" is valid "+isValid);
        }

        for (String name1 : invalidName){
            boolean isValid = regexPractice.valid(name1);
            System.out.println("Name is "+name1+" is valid "+isValid);
        }

    }
}
