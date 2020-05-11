/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Day1 extends VersionControl {
    public int firstBadVersion(int n) {
        long start=0, last=n, var=(start+last)/2;
        while(true) {
            if(var==0)
                return 1;
            System.out.println(var);
            if(isBadVersion((int)var)) {
                if(!isBadVersion((int)var-1))
                    return (int)var;
                last=var;
            }
            else {
                start=var;
            }
            if((start+last)/2!=var)
                var=(start+last)/2;
            else if((start+last)/2==var)
                var=(int)Math.ceil((start+last)/2.0);
            else if(var==1)
                var++;
        }
    }
}
