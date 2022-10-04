public class PartyAffiliation {
    public static void main(String[] args) {

        String partyAffiliation;

        System.out.println("Please enter your party (D, R, or I");

        partyAffiliation = "D";

        if (partyAffiliation.equals("I")){
            System.out.println("You get a Independent Person");
        } else if (partyAffiliation.equals("D")){
            System.out.println("You get a Democratic Donkey");
        } else if (partyAffiliation.equals("R")){
            System.out.println("You get a Republican Elephant");
        }
        else {
            System.out.println("You get Other");
        }
    }
}
