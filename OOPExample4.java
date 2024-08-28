class World{
    String name;
    String level;
    int size;
    public void setName(String name,String l, int s)
    {
        this.name = name;
        level = l;
        size = s;
    }
}
public class OOPExample4 {
    public static void main(String[] args) {    
        World w1 = new World(); //creating object of the class world
        w1.setName("Beru", "General", 10);
        System.out.println("Shadow Name: "+w1.name+"\nLevel: "+w1.level+"\nSize: "+w1.size);
        World w2 = new World();
        w2.setName("Igris", "Knight", 9);
        System.out.println("Shadow Name ");
    }
}
