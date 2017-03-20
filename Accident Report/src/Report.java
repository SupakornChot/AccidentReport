
public class Report {
    public static void main(String arg[]){
        User u1[] = new User[3];
        u1[0]= new User("Supakorn",123);
        Accident a[]=new Accident[3];
        a[0] = new Accident("ขาหัก","CB2","0815657901",u1[0]);
        a[1] = new Accident("ขาก","CB2","015657901",u1[0]);
        a[2] = new Accident("ขาหัก","CB2","0815657901",u1[0]);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
