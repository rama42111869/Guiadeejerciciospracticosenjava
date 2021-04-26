
public class Staff extends Persona{
	
	private double salario;
	private String turno;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Staff [salario=" + this.getSalario() + ", turno=" + this.getTurno() + ", DNI()=" + getDNI() + ", Nombre()="
				+ getNombre() + ", Apellido()=" + getApellido() + ", Email()=" + getEmail() + ", Direccion()="
				+ getDireccion() + "]";
	}
	
	
}
