public class oddeven {
    public static void main(String[] args) {
        int odd=0;
        int even=0;
        for( int i=0 ;i<=20;i++){
            if (i%2==0){
                System.out.println("even number" +i);
                odd++; 
            }
            else{
                System.out.println("ood number" +i);
                even++;
              }
        }
          System.out.println("total number of odd : " +even);
        System.out.println("total number of odd : " +odd);}
}
