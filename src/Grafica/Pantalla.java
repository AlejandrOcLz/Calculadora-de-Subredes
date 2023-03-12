package Grafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Calculator.Operations;

public class Pantalla extends JFrame{
	
	JLabel answer;
	
	public Pantalla(){
		setSize(700,550);
		setLayout(null);
		int x = sizeScreenW();
		int y = sizeScreenH();
		setLocation(x,y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GUI();
		setResizable(false);
		setVisible(true);
		
	}
	
	private void GUI() {
		JLabel Ltype = new JLabel("Ingresar tipo de formato de subred");
		Ltype.setBounds(10,10,200,20);
		add(Ltype);
		
		JComboBox<String> type = new JComboBox<String>();
		type.setBounds(240,10,100,20);//VLSM/FLSM
		type.addItem("VLSM");
		type.addItem("FLSM");
		add(type);
		
		JLabel Lred = new JLabel("Ingresar el tipo de red que va a ingresar");
		Lred.setBounds(10,50,250,20);
		add(Lred);
		
		JComboBox<String> red = new JComboBox<String>();
		red.setBounds(290,50,100,20);// Tipo la red que va a ingresar es una broadcast etc
		red.addItem("RED");
		red.addItem("PDV");
		red.addItem("PC#");
		red.addItem("UDV");
		red.addItem("Broadcast");
		add(red);
		
		JLabel Ltypered = new JLabel("Ingresar tipo de red");
		Ltypered.setBounds(10,90,140,20);// ya sea Lan o Wan
		add(Ltypered);
		
		JComboBox<String> typered = new JComboBox<String>();
		typered.setBounds(180,90,100,20);
		typered.addItem("LAN");
		typered.addItem("WAN");
		add(typered);
		
		JLabel Lpc = new JLabel("Ingresar la cantidad de pc");
		Lpc.setBounds(10,130,180,20);
		add(Lpc);
		
		JTextField pc = new JTextField();
		pc.setBounds(220,130,50,20);
		add(pc);
				
		JLabel Lip = new JLabel("Ingresar la IP");
		Lip.setBounds(10,170,100,20);
		add(Lip);
		
		JTextField ip = new JTextField();
		ip.setBounds(140,170,100,20);
		add(ip);
		
		JButton Start = new JButton("Calcular");
		Start.setBounds(140,210,100,20);
		Start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RealizarCalculo((String)type.getSelectedItem(),(String) red.getSelectedItem(),(String) typered.getSelectedItem(),ip.getText(),Integer.parseInt(pc.getText()));
				
			}

		});
		add(Start);
		
		answer = new JLabel();
		answer.setBounds(140,250,300,200);
		answer.setBackground(Color.WHITE);
		answer.setOpaque(true);
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		add(answer);
		
	}
	
	private void RealizarCalculo(String type, String red, String typered, String IP, int number) {
		Operations op = new Operations();
		String data = "";
		if(type.contains("VLSM")) {
			data = op.VLSM(red, typered, IP, number);
		}else {
			//data = op.FLSM(red, typered, IP, number);
		}
		answer.setText("<html>"+data+"<html>");
	}

	private int sizeScreenW() {
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = getSize().width;
        int x = (pantalla.width - ancho) / 2;
		return x;
	}
	
	private int sizeScreenH() {
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int alto = getSize().height;
        int y = (pantalla.height - alto) / 2;
        return y;
	}

	

	public static void main(String[] args) {
		Pantalla pantalla = new Pantalla();
	}

}
