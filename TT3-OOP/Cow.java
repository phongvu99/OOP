public class Cow {
    private String name;
    private String breed;
    private int age;
    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void moo() {
        System.out.println("Moo...!");
    }

}


