public class 滿分 {
    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("請輸入成績");
        int grade = sc.nextInt();
        if (grade != 100) {

            if (grade >= 60 & grade<100) {
                System.out.println("成績及格：" + grade);
            }
            else {if (grade <0 )
                System.out.println("ERROR!");
                if (grade >100 )
                    System.out.println("ERROR!");
                }
            if (grade<60& grade>0 ){
                System.out.println("成績不及格：" + grade);
                }
            }

        if (grade ==100) { System.out.println("GOOD!");
            }
        System.out.println("End") ;
    }
}
