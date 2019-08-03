package companycombat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//vivo提前批面试第三题：0-1背包问题，
/*题目描述：输入第一行是总金额，第二行是礼品单价，第三行是长度为n的数组，表示对应礼品热度，输出可获得的最高礼品热度
* 测试用例：1000
* 200 600 100 180 300 450
* 6 10 3 4 5 8*/
public class Vivobuygoods {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int total=Integer.parseInt(br.readLine());
        int[] arrA=parseints(br.readLine().split(" "));
        int[] arrB=parseints(br.readLine().split(" "));
        solution(total,arrA,arrB);
    }
    private static void solution(int total,int[] arrA,int[] arrB){
        //algorithm

    }
    private static int[] parseints(String[] strArr){
        if (strArr==null||strArr.length==0){
            return new int[0];
        }
        int[] temp=new int[strArr.length];
        for (int i=0;i<strArr.length;i++){
            temp[i]=Integer.parseInt(strArr[i]);
        }
        return temp;
    }
}
