package robot;

import java.io.*;
import java.util.*;

public class PosicionRobot {
	private Robot robot;
	public Tablero tablero;
	private ArrayList <Object> moverRobot;
	

	public PosicionRobot(String miRobot) throws FileNotFoundException{ //Constructor
			
			String miPath = System.getProperty("user.dir");
			
			Scanner sc = new Scanner(new File(miPath+"\\"+miRobot+".in"));
			this.moverRobot = new ArrayList <Object>();

			String auxLine = sc.nextLine();
			String [] datosRobot = auxLine.split(" ");
			
			this.robot = new Robot(Integer.parseInt(datosRobot[0]), Integer.parseInt(datosRobot[1]),datosRobot[2].charAt(0));
			this.tablero = new Tablero(Integer.parseInt(datosRobot[3]),Integer.parseInt(datosRobot[4]));
			
			auxLine = sc.nextLine();
			datosRobot = auxLine.split("");
			
			for(int i = 0 ; i < datosRobot.length ; i++) {
				if(i%2 == 0) {
					this.moverRobot.add(datosRobot[i].charAt(0));
				}else {
					this.moverRobot.add(Integer.parseInt(datosRobot[i]));
				}
				
			}	
			
		}
	
		
	public void MoverRobot() throws IOException{
		for(int i=0 ; i < this.moverRobot.size()-1 ; i=i+2) {
			if((char) moverRobot.get(i) == 'A') {
				switch (this.robot.getMirandoDireccion()) {
				case 0:
					MoverFila((int) moverRobot.get(i+1));
					break;
				
				case 1:
					MoverColumna((int) moverRobot.get(i+1));
					break;
				
				case 2:
					MoverFila(-((int) moverRobot.get(i+1)));
					break;
					
				case 3:
					MoverColumna(-((int) moverRobot.get(i+1)));
					break;
				}//fin Switch
			}
			if((char) moverRobot.get(i) == 'R') {
				Rotar((int) moverRobot.get(i+1));
			}
		}//Cierra For
		
		Resultado();
	}
	
	public void MoverColumna(int moverse) {
		if(moverse >= 0) {//Tengo que revisar si me muevo de norte a Sur para comparar con los limites superiores o inferior //si debo ir hacia el sur, llegara un numero negativo por parametro
			if (this.robot.getPosicionColumnaX()+moverse >= this.tablero.getColumnasX()) {
				this.robot.setPosicionColumnaX(this.tablero.getColumnasX());
			}else {
				this.robot.setPosicionColumnaX(this.robot.getPosicionColumnaX()+moverse);
			}	
		}else {
			if (this.robot.getPosicionColumnaX()+moverse <= 0) {
				this.robot.setPosicionColumnaX(1);
			}else {
				this.robot.setPosicionColumnaX(this.robot.getPosicionColumnaX()+moverse);
			}
			
		}
	}
	
	public void MoverFila(int moverse) {
		if(moverse >= 0) {
			if(this.robot.getPosicionFilaY()+moverse >= this.tablero.getFilasX()) {
				this.robot.setPosicionFilaY(this.tablero.getFilasX());
			}else {
				this.robot.setPosicionFilaY(this.robot.getPosicionFilaY()+moverse);
			}
		}else {
			if(this.robot.getPosicionFilaY()+moverse <= 0) {
				this.robot.setPosicionFilaY(1);
			}else {
				this.robot.setPosicionFilaY(this.robot.getPosicionFilaY()+moverse);
			}
		}
	}
	
	
	public void Rotar(int rotacion) {
		this.robot.setMirandoDireccion((this.robot.getMirandoDireccion()+rotacion)%4);
	}
	
	
	public void Resultado() throws IOException{
		String miPath=System.getProperty("user.dir");
		FileWriter salida = new FileWriter(miPath+"\\OUTPUT.out");
		System.out.println("PosFila: "+this.robot.getPosicionFilaY());
		System.out.println("PosColumna: "+this.robot.getPosicionColumnaX());
		String stringSalida = String.valueOf(String.valueOf(this.robot.getPosicionFilaY())+" "+this.robot.getPosicionColumnaX());
		salida.write(stringSalida);
		salida.close();
		
	}
	
	
	public static void main(String[] args) throws IOException {
		PosicionRobot pr1 = new PosicionRobot("ROBOT");
		pr1.MoverRobot();
	}

}
