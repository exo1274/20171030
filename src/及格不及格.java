public class 及格不及格 {
    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in );

    System .out .print("請輸入成績");
    int grade =sc.nextInt() ;
    if (grade>=60){
        System .out .println("成績及格："+grade) ;
    }
    else {
        System.out.println("成績不及格：" + grade);
    }
    System .out .println("End");
    }
}
