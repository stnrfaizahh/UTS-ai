
/*
        f(x)=15x−x^2 
Program ini mencoba mencari nilai x yang menghasilkan nilai fitness tertinggi dalam rentang 0 hingga 15.
*/
public class Mainclass{
    
    public static void main(String[] args) {
        Population population = new Population();
        population.initializePopulation();
        population.startGeneric();

    }
    
}