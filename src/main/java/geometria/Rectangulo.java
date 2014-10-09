package geometria;

public class Rectangulo {
	

	private int altura, base;
	
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
        return this.base * this.altura;
    }
	

    public int perimetroRectangulo (){
        return this.base + this.altura;
    }
    
    public double diagonalRectangulo (){
        return Math.sqrt((Math.pow(this.altura, 2)) + (Math.pow(this.base, 2)));
    }

}
