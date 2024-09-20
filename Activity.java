public class Activity{
    public static void main(String[] args ){
        Dog aso = new Dog();
        aso.setName("Max");
        aso.puppies = 3;

        aso.doggy[0]= "Whitey";
        aso.doggy[1]= "dogger man";
        aso.doggy[2]= "Uno";

        System.out.println(aso.name());
        System.out.println(aso.bark());
        System.out.println(aso.showNumberOfPuppies());

        for (int i = 0; i < 3; i++){
            System.out.println("Puppy: "+ aso.doggy[i]);
        }
    }
}
