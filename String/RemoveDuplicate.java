public class RemoveDuplicate {
    
    public static void main(String[] args)
    {
        String str = "programming";

        StringBuilder sbl = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i+1);

            if(idx == -1)
            {
                sbl.append(ch);
            }
        }
        System.out.println(sbl);


    }
}
