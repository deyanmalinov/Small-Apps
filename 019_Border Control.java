package DPM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Identifable> things = new ArrayList<>();
        String lines;
        while (true){
            if ("End".equals(lines=scan.nextLine())){
                break;
            }
            String[] line=lines.split(" ");
            Identifable identifable= null;
            if (line.length==2){
                identifable=new Robot(line[0], line[1]);
            }else if (line.length==3){
                identifable= new Citizen(line[0], Integer.parseInt(line[1]), line[2]);
            }
            things.add(identifable);
        }
        String fakeID = scan.nextLine();
        things.stream().filter(identifable -> identifable.getId()
                .endsWith(fakeID))
                .forEach(identifable -> System.out.println(identifable.getId()));
       }
}-----------------------------------------------
package DPM;
public interface Identifable {
    String getId();
}-----------------------------------------------
package DPM;
public class Citizen implements Identifable {
    private String name;
    private int age;
    private String id;
    public Citizen(String name, int age, String id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    @Override
    public String getId() {
        return this.id;
    }
}---------------------------------------
package DPM;
public class Robot implements Identifable {
    private String model;
    private String  id;
    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }
    @Override
    public String getId() {
        return this.id;
    }
}----------------------------------------