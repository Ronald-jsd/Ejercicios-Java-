/*Problema 1 Una tienda vende un producto a precios unitarios que dependen de la cantidad de unidades adquiridas de acuerdo con la siguiente tabla
Unidades adquiridas Precio unitario
1 a 25 S/. 27.7
26 a 50 S/. 25.5
51 a 75 S/. 23.5
76 en adelante S/. 21.5

Adicionalmente, si el cliente adquiere más de 50 unidades la tienda le descuenta el 15% del importe
de la compra; en caso contrario, sólo le descuenta el 5% del importe compra. Diseñe un programa
que determine el importe de la compra, el importe del descuento y el importe a pagar por la compra
de cierta cantidad de unidades del producto.
*/
package cibertecEjercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Tienda_if extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblUnidades;
	private JTextField txtUnidades;
	private JButton btnProcesar;
	private JButton btnBorrar;


	/**
	 * Create the frame.
	 */
	public Tienda_if() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblUnidades = new JLabel("Unidades de producto");
			lblUnidades.setBounds(85, 74, 125, 13);
			contentPane.add(lblUnidades);
		}
		{
			txtUnidades = new JTextField();
			txtUnidades.setBounds(218, 71, 76, 19);
			contentPane.add(txtUnidades);
			txtUnidades.setColumns(10);
		}
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnProcesarActionPerformed(e);
				}
			});
			btnProcesar.setBounds(326, 31, 81, 21);
			contentPane.add(btnProcesar);
		}
		{
			btnBorrar = new JButton("Borrar");
			btnBorrar.setBounds(326, 74, 81, 21);
			contentPane.add(btnBorrar);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(34, 141, 414, 214);
			contentPane.add(txtS);
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda_if frame = new Tienda_if();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double precioUnitario = 0;
	double importeCompra = 0;
	double importeDescuento = 0;
	double totalPagar;
	private JTextArea txtS;
	
	protected void btnProcesarActionPerformed(ActionEvent arg0) {
		txtS.setText("");

		try{ int unidades = Integer.parseInt(txtUnidades.getText());

		determinarPrecioPorUnidad(unidades);
		
		//IMPORTE COMPRA
		importeCompra = precioUnitario * unidades;
		//IMPORTE DESCUENTO
		if(unidades >50 ) {
			importeDescuento = 	 (importeCompra * 0.15);
		}else importeDescuento =    (importeCompra * 0.05);
		
		
		
		
		//IMPORTE A PAGAR 		
		totalPagar = importeCompra - importeDescuento;	
		
		mostrarResultados(unidades);
		
		}
		
		catch (Exception e) {
			imprimir("Ingrese un numero valido");
		}
	
	}
	
	
	public void determinarPrecioPorUnidad(int unidades) {
	//determinar el precio unitario segun las unidades 

	
		
		 if(unidades >= 1 && unidades <= 25) {
			 precioUnitario = 27.7;
		} else if(unidades >= 26 &&  unidades <= 50 ) {
			 precioUnitario = 25.5;
		}else if(unidades >= 51 && unidades <=75) {
			 	precioUnitario = 23.5;
		}else precioUnitario = 21.5;
		
		
	}
	
	
	
	public void mostrarResultados(int unidades) {
		
		if(unidades < 1) {
			imprimir("Ingrese un numero mayor a 0");
			return;
		}
		imprimir("Precio unitario: "+  precioUnitario);
		imprimir("Importe de compra: " + importeCompra);
		imprimir("Importe descuento: " + importeDescuento);
		imprimir("Improte total a pagar:" + totalPagar);
	}
	
	
	public void imprimir(String cad) {
		txtS.append(cad + "\n");
	}
}
