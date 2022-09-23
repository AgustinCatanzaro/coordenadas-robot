package robot;


public class Robot {
	private int posicionColumnaX;
	private int posicionFilaY;
	private char mirandoInicial;
	private int mirandoDireccion;
	//private char [] mirarDireccionArray = {'N','E','S','O'};
	
	
	public Robot(int posColX, int posFilY, char mirIni){
			
			this.posicionColumnaX = posColX;
			this.posicionFilaY = posFilY;
			this.mirandoInicial = mirIni;
			if (this.mirandoInicial == 'N') {
				this.mirandoDireccion = 0;
			} else if (this.mirandoInicial == 'E') {
				this.mirandoDireccion = 1;
			} else if (this.mirandoInicial == 'S') {
				this.mirandoDireccion = 2;
			} else {
				this.mirandoDireccion = 3;
			}
			
		}
		
		
	public int getPosicionColumnaX() {
		return posicionColumnaX;
	}
	
	
	
	public void setPosicionColumnaX(int posicionColumnaX) {
		this.posicionColumnaX = posicionColumnaX;
	}
	
	
	public int getPosicionFilaY() {
		return posicionFilaY;
	}
	
	
	public void setPosicionFilaY(int posicionFilaY) {
		this.posicionFilaY = posicionFilaY;
	}
	
	
	public int getMirandoDireccion() {
		return mirandoDireccion;
	}
	
	public void setMirandoDireccion(int mirandoDireccion) {
		this.mirandoDireccion = mirandoDireccion;
	}

}


