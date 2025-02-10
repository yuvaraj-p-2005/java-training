class Strings1 {
    public static void main(String[] args){
        String s="hello"; 
        System.out.println(s.length());
        String s1="add";
        System.out.println(s1.isBlank());
        String s3="abc";
        String s4="abc";
        System.out.println(s3==s4);
        String s5=new String("abc");
        String s6=new String("abc");
        System.out.println(s5==s6);
        String s7="abc";
        String s8="egf";
        System.out.println(s1.compareTo(s8));
        //return 0 is same
        //retune nagavitive value is s1<s2
        //retuen positive value is s1>s2
        System.out.println(s1.compareToIgnoreCase(s7));
        String s9="slince please dont talk";
        System.out.println(s9.startsWith("slince"));
        System.out.println(s9.startsWith("please"));
        System.out.println(s9.endsWith("please"));

        
    }
    
}
