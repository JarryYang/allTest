package companycombat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*网易笔试：第一行一个整数,代表班级人数，第二行是一个数组代表每个学生成绩，第三行是查询次数，第四行开始是查询的那几个人
* 样例输入：
* 3
* 100 98 87
* 3
* 1
* 2
* 3
* 输出
66.666667
33.333333
0.000000*/
public class WangyiBaiFenSort {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        String s;
        while(!(s=in.nextLine()).equals("")){
            ls.add(s);
        }//输入最关键的一步
        int n;
        Iterator<String> ite=ls.iterator();
        n=Integer.parseInt(ite.next());
        String stt=ite.next();
        String[] dd=stt.split(" ");//
        //stt=stt.replace(" ","");//如果不重新赋值一下，原来的stt不会改变//另外，replaceAll的用法：s.replaceAll("\\d","f"):将s中所有的数字替换为f
        int[] chengji=new int[n];
        for(int i=0;i<dd.length;i++){
            chengji[i]=Integer.parseInt(dd[i]);
        }
        int sum=Integer.parseInt(ite.next());
        int[] st=new int[ls.size()-3];
        int i=0;
        while(ite.hasNext()){
            st[i]=Integer.parseInt(ite.next());
            i++;
        }
        test(n,chengji,sum,st);
    }
    private static void test(int n, int[] a, int num,int[] q){
        double[] result=new double[num];
        for(int i=0;i<num;i++){
            int index=q[i]-1;//第几个人
            int sum=0;//总共几个人小于等于他的分数
            for(int x=0;x<n;x++){
                if(a[x]<=a[index])
                    sum++;
            }
            double re= (double)(sum-1)*100/n;
            result[i]=re;
        }

        for (double i:result) {
            String shuchu = String.format("%.6f", i);
            System.out.println(shuchu);
        }
    }

}
