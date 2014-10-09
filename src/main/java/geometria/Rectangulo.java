package geometria;

public class Rectangulo {
	
	public int areaRectangulo (int base, int altura){
        return base * altura;
    }
	
    public int perimetroRectangulo (int base, int altura){
        return base + altura;
    }
    
    public double diagonalRectangulo (double base, double altura){
        return Math.sqrt((Math.pow(altura, 2)) + (Math.pow(base, 2)));
    }

}
