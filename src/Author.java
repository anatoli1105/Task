public class Author {

    private  String name;
    private String surName;
    private int age;

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
    public Author(String name,String surName,int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
    @Override
    public boolean equals(Object O) {
        if (this.getClass() != O.getClass()) {
            return false;
        }
        Author author = (Author) O;
        return name.equals(author.name);

    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public String toString() {
        String Author = String.format("%s %s \t (%d г.)", name, surName, age);
        return Author;
    }

}
