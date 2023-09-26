import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Persona2;

public class TestEquipoDeTrabajo {
	
	private EquipoDeTrabajo equipo;
	private Persona2 p1; 
	private Persona2 p2;
	private Persona2 p3;
	private Persona2 p4;
	private Persona2 p5;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		equipo = new EquipoDeTrabajo("The Fort");
		p1 = new Persona2("Ian", "Gardella", 23);
		p2 = new Persona2("Thiago", "Gardella", 16);
		p3 = new Persona2("Ricardo", "Fort", 43);
		p4 = new Persona2("Pepe", "Argento", 60);
		p5 = new Persona2("Rodrigo", "El Bueno", 30);
		
		equipo.addEmpleado(p1);
		equipo.addEmpleado(p2);
		equipo.addEmpleado(p3);
		equipo.addEmpleado(p4);
		equipo.addEmpleado(p5);
		
	}
	@Test
	public void testPromedioEdad() {
		int promedio = equipo.promedioEdad();
		assertEquals(34, promedio);
	}

}
 