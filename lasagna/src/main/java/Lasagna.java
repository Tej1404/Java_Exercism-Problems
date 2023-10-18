public class Lasagna {
    private int expectedCookingTime=40;
    private int timeTakenToCookOneLayer=2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return expectedCookingTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedCookingTime-actualMinutesInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayersAdded){
        return timeTakenToCookOneLayer*numberOfLayersAdded;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayersAdded,int actualMinutesInOven ){
        return actualMinutesInOven+ timeTakenToCookOneLayer*numberOfLayersAdded;
    }
}
