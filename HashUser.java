import java.awt.*;

public class HashUser {
    String name;
    int id;
    int age;

    public HashUser(String name, int id, int age)
    {
        this.age = age;
        this.id = id;
        this.name = name;
    }
    public int hashCode(){

        int h = id+ name.hashCode();
        return h & 15;

    }

    public boolean equals(Object o){

        return (this.name==name && this.id==id);

    }
}
