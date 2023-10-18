import java.util.*;
class PrimeCalculator {

    int nth(int nth) throws IllegalArgumentException {
        if(nth<=0)
            throw new IllegalArgumentException();
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(2);
        l.add(3);
        if(nth==1)
            return 2;
        if(nth==2)
            return 3;
        int number=5,count=2;
        while(l.size()<=nth){
            if(checkPrime(number)){
                l.add(number);
                count+=1;
            }
            number+=2;
        }
        return l.get(nth-1);
    }

    boolean checkPrime(int n){
        for(int i=2;i<= n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
