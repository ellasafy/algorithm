package com.algorithm.all;

import java.io.IOException;
import java.io.StreamTokenizer;

public class Tower {
	
    public static int n,m,sx,sy,ex,ey,inf=999999999;
    
    /**
     * 垒积木问题
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException 
    {
//      Scanner ss=new Scanner(System.in);
        StreamTokenizer st=new StreamTokenizer(System.in);
          
        while(st.nextToken()!=StreamTokenizer.TT_EOF)
        {
            n=(int)st.nval;
            int a[][][]=new int[101][101][101];
            int maxl=0,maxw=0,maxh=0;
            for(int i=1;i<=n;i++)
            {
                st.nextToken();int l=(int)st.nval;
                st.nextToken();int w=(int)st.nval;
                st.nextToken();int h=(int)st.nval;
                a[l][w][h]++;
                if(l>maxl)maxl=l;
                if(w>maxw)maxw=w;
                if(h>maxh)maxh=h;
            }
            for(int i=1;i<=maxl;i++)
                for(int j=1;j<=maxw;j++)
                    for(int k=1;k<=maxh;k++)
                    {
                        int temp=0;
                        if(i>=1)temp=Math.max(temp, a[i-1][j][k]);
                        if(j>=1)temp=Math.max(temp, a[i][j-1][k]);
                        if(k>=1)temp=Math.max(temp, a[i][j][k-1]);
                        a[i][j][k]+=temp;
                    }
              
              
              
            System.out.println(a[maxl][maxw][maxh]);
        }
    }
      

}
