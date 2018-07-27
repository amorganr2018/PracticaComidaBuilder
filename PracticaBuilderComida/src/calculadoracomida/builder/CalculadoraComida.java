package calculadoracomida.builder;

import calculadoracomida.builder.InformacionComida.InformacionComidaBuilder;

import calculadoracomida.Medida;

public class CalculadoraComida{
	
	public static void main(String[] args) {
		
		InformacionComida comida;
		InformacionComidaBuilder builder = new InformacionComida.InformacionComidaBuilder("Sopa Negra");
		builder = builder.cantidadPorcion(2).unidadMedida(Medida.ML).porciones(2).calorias(500).grasa(50).sodio(5).carbohidratos(15);
		comida = builder.createInformacionComida();
		System.out.println(comida.toString());
		
	}
	
	
}