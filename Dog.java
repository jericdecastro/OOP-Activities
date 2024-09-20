public class Dog {
    String name;
    boolean isMale;
    int puppies;
    String[] doggy = new String[3];

    public String name(){
        return "name: " +name;
    }
    public int numberOfPuppies(){
        return puppies;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumberOfPuppies(int puppies){
        this.puppies = puppies;
    }

    public String showNumberOfPuppies(){
        return name + " has " + puppies + " puppies. ";
    }

    public String showPuppies(){
        if(puppies == 0){
            return name + "has no puppies. ";
        }else{
            return name + " has " + puppies + "puppies. ";
        }
    }

    public String bark(){
        return "Woof! Woof!";
    }




}
