package Greedy;

public class Nmeetingsinoneroom {
    public static void maxMeetings(int start[], int end[], int n)
    {

 int i=0;
        System.out.print(i+" ");
            for(int j=1;j<end.length;j++){

                if(start[j]>=end[i]) {
                    System.out.print(j+" ");
                    i=j;
                    break;
                }
                /*else {
                    start1=start[i-1];
                    end1=end[i-1];
                    break;
                }*/

        }

    }
    public static void main(String[] args) {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};
    int n=6;
  maxMeetings(start,end,6);
    }
}
