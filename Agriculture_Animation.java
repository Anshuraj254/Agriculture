class Agriculture_Animation 
{
    public static void Animation () throws InterruptedException
    {
    String s= "***Agriculture System***";
    for(int i = 0; i<s.length(); i++)
    {
    Thread.sleep(300);
    System.out.print(s.charAt(i));
    }
    }
}
