public class Circulo implements Metodos {


	private double radio;
	private String color;
	
	
	
	public Circulo(double radio, String color) {
		super();
		this.radio = radio;
		this.color = color;
	}


	@Override
	public double area(double radio) {
		return (radio*radio)*Math.PI;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

	@Override
	public String toString() {
		return "Circulo [radio=" + this.getRadio() + ", color=" + this.getColor() + "]";
	}


	@Override
	public double volumen(double radio, double altura) {
		return (radio*radio)*Math.PI*altura;
	}


	@Override
	public double area(double radio, double areabase,double altura) {
		return 2*Math.PI*radio*altura+2*areabase;
	}
}
