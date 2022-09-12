
public class Alumno311 {

	private String nombre;
	private String pApellido;
	private String sApellido;
	private int nControl;
	
	public String getpApellido() {
		return pApellido;
	}

	public String getsApellido() {
		return sApellido;
	}
	public int getnControl() {
		return nControl;
	}
	public String getNombre() {
		return nombre;
	}
		
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public void setnControl(int nControl) {
		this.nControl = nControl;
	}

	public Alumno311() {	
	}
	public Alumno311(String nombre, String pApellido, String sApellido, int nControl) {
		this.nombre = nombre;
		this.pApellido = pApellido;
		this.sApellido = sApellido;
		this.nControl = nControl;
	}

	
	
}
