public class Promedio{
    public static void main(String args[]){
   
    int mate = 8 ;
    int quim = 10;
    int biol = 3 ;
    int prom = 0 ;

    prom = (mate + quim + biol) / 3;

    if(prom >= 7){
    System.out.println("Aprobó con " + prom);
    } else{
    System.out.println("Desaprobó con " + prom);
    }   
 }
}