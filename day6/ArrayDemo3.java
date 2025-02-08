public class ArrayDemo3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int freq[]=new int[a.length];
        for(int i=0;i<a.length;i++)
    {
        int no=a[i];
        int count=1;
        for(int j=1;j<a.length;j++)
        {
            if(no==a[j])
            {
                count++;
                freq[j]=-1;
            }
        }
        if(freq[i]!=-1)
        {
          freq[i]=count;
        }

    }
    //System.out.println(Array.tostring(freq));

  }


}
