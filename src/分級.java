public class 分級 {public static void main(String[] args) {
    //顯示訊息
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("請輸入成績");
    int grade = sc.nextInt();
    if (grade >=90){
        System.out.print("得分等級：A");
    }
    else if(grade>=80){
        System.out.print("得分等級：B");
    }
        else if (grade >=70){
            System.out.print("得分等級：C");
        }
            else if  (grade >=60){
                System.out.print("得分等級：D");
            }
                else if  (grade <60){
                    System.out.print("得分等級：E(不及格)");
                }
}
}
