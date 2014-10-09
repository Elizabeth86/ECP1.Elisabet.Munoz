package geometria;

public class Rectangulo {
	
	private int base, altura;
	
	public Rectangulo (int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }
    
	public double areaRectangulo (){
        return base * altura;
    }
	
    public double perimetroRectangulo (double base, double altura){
        return base + altura;
    }
    
    public double diagonalRectangulo (double base, double altura){
        return Math.sqrt((Math.pow(altura, 2)) + (Math.pow(base, 2)));
    }

}
