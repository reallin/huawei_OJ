package Main;

import java.util.Scanner;

public class Main {
    static boolean isDone;
    static int[] cards = new int[4];//存储输入的四张牌
    static boolean[] flag = new boolean[4];//dfs时标记哪些牌用过
    static int number(String card)  //把字符串转成double类型
    {
        if(card.equals("A"))
            return 1;
        else if(card.equals("J"))
            return 11;
        else if(card.equals("Q"))
            return 12;
        else if(card.equals("K"))
            return 13;
        else if(card.equals("joker"))
            return 0;
        else if(card.equals("JOKER"))
            return 0;
        else
            return Integer.parseInt(card);
    }
    static String str(double card)  //把double类型转成字符串
    {
        if(card == 1)
            return "A";
        else if(card == 11)
            return "J";
        else if(card == 12)
            return "Q";
        else if(card == 13)
            return "K";
        else if(card == 2) return "2";
        else if(card == 3) return "3";
        else if(card == 4) return "4";
        else if(card == 5) return "5";
        else if(card == 6) return "6";
        else if(card == 7) return "7";
        else if(card == 8) return "8";
        else if(card == 9) return "9";
        else if(card == 10) return "10";
        return "";
    }
    static boolean check(int cards[])   //检查是否存在大小王
    {
        for(int i = 0;i < 4;i ++)
        {
            if(cards[i]==0)
                return false;
        }
        return true;
    }
    static void dfs(int path1[],String path2[],double count,int num)
    {
        if(isDone) return ;
        if(count == 24 && num == 4)   //总数等于24并且用了4张牌，证明找到
        {
            for(int index = 0;index<3;index ++)
            {
                System.out.print(str(path1[index])+path2[index+1]);
            }
            System.out.println(str(path1[3]));
            isDone = true;  //作为一个标记是否已找到可以构成24点的
            return;
        }
        for(int i = 0; i < 4 ; i++)
        {
            if(!flag[i])
            {
                flag[i]=true;    //标记这张牌用了
                path1[num] = cards[i];
              
                path2[num] = "+";
                dfs(path1, path2, count + cards[i], num+1);   //dfs加上cards[i]的情况
                if(num > 0)
                {
                    path2[num] = "-";
                    dfs(path1, path2, count - cards[i], num+1);  //dfs减去cards[i]的情况
                  
                    path2[num] = "*";
                    dfs(path1, path2, count * cards[i], num+1);  //dfs乘以cards[i]的情况
                  
                    path2[num] = "/";
                    dfs(path1, path2, count / cards[i], num+1); //dfs除以cards[i]的情况
                }
                flag[i]=false;   //取消标记，表示放掉这张牌
            }
            if(isDone)
                return ;
        }
    }

    public static void main(String[] args) {
        double count;
        int[] path1 = new int[4];
        int num;
        String[] path2 = new String[4];
        String firstCard,secondCard,thirdCard,fourthCard;
        Scanner cin = new Scanner(System.in);
       
        while (cin.hasNext()) {
            firstCard = cin.next();
            secondCard = cin.next();
            thirdCard = cin.next();
            fourthCard = cin.next();
            count = 0.0;
            num = 0;
            isDone = false;
            cards[0] = number(firstCard);
            cards[1] = number(secondCard);
            cards[2] = number(thirdCard);
            cards[3] = number(fourthCard);
            if(!check(cards))
            {
                System.out.println("ERROR");
                continue;
            }
            dfs(path1,path2,count,num);
            if(!isDone)  //如果等于false，证明没有标记过，则找不到
                System.out.println("NONE");
           
        }
    }
}