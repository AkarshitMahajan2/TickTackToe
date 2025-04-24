import java.util.*;
public class TickTackToe
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int m[][]=new int[3][3];
        int p1,p2,i,a,b,c=0;
        String s1,s2;
        System.out.println("**** Welcome To Tick Tack Toe Game 3X3 Matrix****");
        System.out.println("Player 1 Enter Value As '9' Player 2 Enter Value As '6' ");
        System.out.println("Player 1 Enter Your Name");
        s1=sc.nextLine();
        System.out.println("Player 2 Enter Your Name");
        s2=sc.nextLine();
        for(i=0;i<9;i++)
        {
            
            if(i%2==0)
            {
            System.out.println(s1+":Enter Your Rows Number Coloum Number One By One");
            a=sc.nextInt();
            b=sc.nextInt();
            m[a][b]=9;
            for(a=0;a<3;a++)
            {
                for(b=0;b<3;b++)
                {
                    System.out.print(m[a][b]+" ");
                }
                System.out.println();
            } 
            a=0;b=0;
            if(m[0][0]==m[2][2]&&m[1][1]==m[2][2])
            {
                if(m[1][1]==9)
                {
                System.out.println(s1+"Wins");
                c++;
                break;
                }
                else
                if(m[1][1]==6)
                {
                    System.out.println(s2+"Wins");
                    c++;
                    break;
                }
            }
            else
            if(m[0][2]==m[2][2] && m[1][1]==m[2][2])
            {
                if(m[1][1]==9)
                {
                   System.out.println(s1+"Wins");
                   c++;
                   break;
                }
                else
                if(m[1][1]==6)
                {
                    System.out.println(s2+"Wins");
                    c++;
                    break;
                }
            }
            else
            if(m[0][1]==m[2][1] && m[1][1]==m[2][1])
            {
              if(m[1][1]==9)
              {
               System.out.println(s1+"Wins");
               c++;
               break;

              }
              else
              if(m[1][1]==6)
              {
                  System.out.println(s2+"Wins");
                  c++;
                  break;
              }
            }
            else
            if(m[1][0]==m[1][2] && m[1][1]==m[1][2])
            {
                if(m[1][1]==9)
                {
                            System.out.println(s1+"Wins");
                            c++;
                            break;

                }
                else
                if(m[1][1]==6)
                {
                    System.out.println(s2+"Wins");
                    c++;
                    break;
                }
            }
        }
        else
        {
        System.out.println(s2+":Enter Row Number And Coloumn Number One By One");
        a=sc.nextInt();
        b=sc.nextInt();
        m[a][b]=6;
        for(a=0;a<3;a++)
        {
            for(b=0;b<3;b++)
            {
                System.out.println(m[a][b]+" ");
            }
            System.out.println();
        }
        a=0;b=0;
        if(m[0][0]==m[2][2]&&m[1][1]==m[2][2])
            {
                if(m[1][1]==9)
                {
                    System.out.println(s1+"Wins");
                    c++;
                    break;
                }
                else
                if(m[1][1]==6)
                {
                    System.out.println(s2+"Wins");
                    c++;
                    break;
                }
            }
            else
            if(m[0][2]==m[2][2] &&m[1][1]==m[2][2])
            {
                if(m[1][1]==9)
                {
                    System.out.println(s1+"Wins");
                    c++;
                    break;
                }
                else
                if(m[1][1]==6)
                {
                    System.out.println(s2+"Wins");
                    c++;
                    break;
                }
            }
            else
            if(m[0][1]==m[2][1] &&m[1][1]==m[2][1])
            {
                if(m[1][1]==9)
                {
                    System.out.println(s1+"Wins");
                    c++;
                    break;
                }
                else
                if(m[1][1]==6)
                {
                    System.out.println(s2+"Wins");
                    c++;
                    break;
                }
            }
            else
            if(m[1][0]==m[1][2] &&m[1][1]==m[1][2])
            {
                if(m[1][1]==9)
                {
                  System.out.println(s1+"Wins!!!");
                    c++;
                    break;  
                }
                else
                if(m[1][1]==6)
                {
                  System.out.println(s2+"Wins!!!");
                    c++;
                    break;  
                }
            }
        }
        }
        if(c==0)
        System.out.println("Sorry,No Player Wins????? Try Again......");
        }

    }

