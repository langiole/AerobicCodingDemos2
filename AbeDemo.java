/*
PrintName anonymous = new PrintName(){
    public String printUserName(String firstName, String lastName){
            return String.format(“%s %s”, firstName,lastName);
        }
};
anonymous.printUserName(“Abraham”, “Pierrot”);
*/

@FunctionalInterface
interface PrintName {
    public String printUserName(String firstName, String lastName);
}

public class AbeDemo {
    public static void main(String[] args) {
        PrintName anon = (String firstName, String lastName) -> 
        { return String.format("%s %s", firstName,lastName); };
        System.out.println(anon.printUserName("Lee", "Angioletti"));
    }

}