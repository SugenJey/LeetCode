class Solution {
    public int romanToInt(String s) {
    int total=0;
        for(int x=s.length()-1;x>=0;x--)
    {
        if(s.charAt(x)=='I')
        {
           total+=1; 
        }
        if(s.charAt(x)=='V')
        {
              if(x>0&&s.charAt(x-1)=='I')
              {
                  total+=4;
                  x--;
                  continue;
              }
              else
              {
                  total+=5;
              }
              
        }
        if(s.charAt(x)=='X')
        {
              if(x>0&&s.charAt(x-1)=='I')
              {
                  total+=9;
                  x--;
                  continue;
              }
              else
              {
                  total+=10;
              }
              
        }
        if(s.charAt(x)=='L')
        {
              if(x>0&&s.charAt(x-1)=='X')
              {
                  total+=40;
                  x--;
                  continue;
              }
              else
              {
                  total+=50;
              }
              
        }
        if(s.charAt(x)=='C')
        {
              if(x>0&&s.charAt(x-1)=='X')
              {
                  total+=90;
                  x--;
                  continue;
              }
              else
              {
                  total+=100;
              }
              
        }
        if(s.charAt(x)=='D')
        {
              if(x>0&&s.charAt(x-1)=='C')
              {
                  total+=400;
                  x--;
                  continue;
              }
              else
              {
                  total+=500;
              }
              
        }
        if(s.charAt(x)=='M')
        {
              if(x>0&&s.charAt(x-1)=='C')
              {
                  total+=900;
                  x--;
                  continue;
              }
              else
              {
                  total+=1000;
              }
              
        }
    }
     return total;
    }
}