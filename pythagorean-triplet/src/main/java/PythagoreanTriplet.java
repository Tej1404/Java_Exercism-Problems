import java.util.List;
import java.util.*;
class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    @Override
    public String toString() {
        return "PythagoreanTriplet{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    static class TripletListBuilder {
        private int sumTo=Integer.MAX_VALUE;
        private int maxFactor=Integer.MAX_VALUE;
        TripletListBuilder thatSumTo(int sum) {
            this.sumTo=sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor= maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets= new ArrayList<>();
            for(int a=1; a<this.sumTo && a< this.maxFactor;a++){
                for(int b=a+1;b< this.sumTo && b< this.maxFactor;b++){
                    int c= (int) Math.sqrt(a*a + b*b);
                    if((c<= this.maxFactor) && (a*a + b*b == c*c) && (a+b+c==this.sumTo)){
                        triplets.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
            return triplets;
        }

    }

}