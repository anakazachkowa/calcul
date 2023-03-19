import java.util.Scanner;


public class Stringcalc{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       char z;
       String[] a;

       if (str.contains("+")){
           a = str.split("\\+");
           z = '+';
       }else if (str.contains("-")){
           a = str.split("-");
           z = '-';
       }else if (str.contains("*")){
           a = str.split("\\*");
           z = '*';
       }else if (str.contains("/")){
           a = str.split("/");
           z = '/';
       }else {
           throw new Exception("Неподдерживаемый знак действия");
       }
       if (z =='*'|| z =='/'){
           if (a[1].contains("\"")) throw new Exception("Делить или умножать сроку можно только на число");
       }
       if (z =='+'|| z =='-'){
           if (!a[0].contains("\"")) throw new Exception("Первым аргументом должна быть срока");
       }
       for (int i = 0; i < a.length; i++){
           a[i] = a[i].replace("\"","");
           if (a[i].length()>10) throw new Exception("Строка должна быть не более 10 символов");


       }
       if (z == '+') {
           String rez = a[0] + a[1];
           if (rez.length() > 40) {
           String r = rez.substring(0, 40);
           System.out.println("\""+r + "..."+"\"");
           }else {
               System.out.println("\""+rez+"\"");
           }
       }else if (z == '*'){
           int y = Integer.parseInt(a[1]);
           String rez = "";
           for (int i = 0; i < y; i++) {
               rez += a[0];
               if (y >10) throw new Exception("Чосло должно быть от 1 до 10");

               }
           if (rez.length() >40){
               String r = rez.substring(0,40);
               System.out.println("\""+r+"..."+"\"");
           }else {
               System.out.println("\""+rez+"\"");
           }



       }else if (z == '-'){
           int id = a[0].indexOf(a[1]);
           if (id == -1){
               System.out.println("\""+a[0]+"\"");
           }else{
               String rez = a[0].substring(0,id);
               rez+=a[0].substring(id+a[1].length());
               System.out.println("\""+rez+"\"");
           }


           } if( z == '/') {
           int w = Integer.parseInt(a[1]);
            int n = a[0].length() / w;
            String rez = a[0].substring(0, n);
            System.out.println("\"" + rez + "\"");
            if (w >10) throw new Exception("Число должно быть от 1 до 10");





       }

       }
}




