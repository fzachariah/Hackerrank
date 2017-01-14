    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean returnvalue=false;
        if(a.length()!=b.length())
            {
            returnvalue=false;
            //System.out.println("Not Anagrams");
        }
        else
            {
           int ar[]=new int[26];
            for(int i=0;i<a.length();i++)
                {
                   char charA=a.charAt(i);
                int intA= (int)charA;
                char charB=b.charAt(i);
                int intB= (int)charB;
                ar[intA-97]=ar[intA-97]+1;
                ar[intB-97]=ar[intB-97]-1;
                    
            }
            boolean check=false;
            for(int i=0;i<26;i++)
                {
                    if(ar[i]!=0)
                        {
                         returnvalue=false;
                        check=true;
                    }
            }
            if(!check)
                {
                 returnvalue=true;
            }
            
        }
        return returnvalue;
    }
        
    