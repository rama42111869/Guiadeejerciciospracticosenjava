public class Cilindro extends Circulo implements Metodos{

	private double altura;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Cilindro(double radio, String color) {
		super(radio, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + this.getAltura()+ ", Radio=" + getRadio() + ", Color=" + getColor() + "]";
	}
	
	
}
