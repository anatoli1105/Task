public class Author {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private  String name;
    private String surName;
    private int age;
    public Author(String name,String surName,int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    @Override
    public String toString() {
        String Author = String.format("%s %s \n %d", name, surName, age);
        return Author;
    }

}
