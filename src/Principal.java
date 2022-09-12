import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
//		MetodosEnGeneral meg = new MetodosEnGeneral();		 
//		double r = meg.vianey(155, 353);		
//		System.out.println(r);		
//		double r1 = meg.otroMetodo(10.23, 32.5);			
//		double rf = r1/r;
//		JOptionPane.showMessageDialog(null,"Temperaturas promedio anuales: "+ rf);
	// Sobre carga de constructures
//		Alumno311 al311 = new Alumno311();
//		//al311.setNombre("Luis Aguilar");
//		
//		Alumno311 al311_1 = new Alumno311("Luis","Hernandez","Garcia",123);
//		
//		String nom = al311_1.getNombre();
//		String pa = al311_1.getpApellido();
//		String sa = al311_1.getsApellido();
//		int nc = al311_1.getnControl();
		
		Intermedia i = new Intermedia();		
		Alumno311 a = i.devuelveAlumno();	
		
		JOptionPane.showMessageDialog(null,"Nombre: "+ a.getNombre()
		+"\n Apellido paterno: "+ a.getpApellido()+"\n"+ 
		"Apellido materno: "+a.getsApellido()
		+"\n N�mero de control: "+a.getnControl());
	System.out.println("Git hola mundo git");
	}

}
