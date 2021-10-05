class MyClass
{
    String reverse(String str)
    {
        String r="";
        for(int i=str.length()-1;i>=0;i--)
            r=r+str.charAt(i);
        return r;
    }
    public void palindrome(String s)
    {
        if(s.equalsIgnoreCase(reverse(s)))
            System.out.println(s+" is Palindrome");
        else
            System.out.println(s+" is not Palindrome");
    }    
}
