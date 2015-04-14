package com.gartisk.jbehave.steps;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import com.gartisk.jbehave.Triangulo;


public class TrianguloScenarioSteps extends Steps{
	
	private Triangulo trianguloEquilatero;
	private String tipoTriangulo;
	
	
	@Given("Usuário da entrada com valores a, b, c respectivamente $a, $b, $c")
	public void givenPreencheTriangulo(int a, int b, int c){
		trianguloEquilatero = new Triangulo(a, b, c);
	}
	
	@When("o Sistema entao irá computar o resultado")
	public void whenRetornaTipo(){
		tipoTriangulo = trianguloEquilatero.retornarTipo();
	}
	
	@Then("o Sistema devera responder $tipoTriangulo")
	public void theComparaTipo( String tipoTriangulo){
		assertThat(tipoTriangulo, is(this.tipoTriangulo) );
	}
	
}

// TESTES ANTIGOS

//@Test 
//public void testarTrianguloEquilatero() {
//	Triangulo equilatero = new Triangulo(3, 3, 3);
//	Assert.assertEquals(TipoTriangulo.EQUILATERO, equilatero.retornarTipo());
//}
//
//@Test
//public void testarIsoscelesValido() {
//	Triangulo escaleno = new Triangulo(3, 3, 2);
//	Assert.assertEquals(TipoTriangulo.ISOCELES, escaleno.retornarTipo());
//}
//
//@Test
//public void testarEscalenoValido() {
//	Triangulo escaleno = new Triangulo(3, 4, 5);
//	Assert.assertEquals(TipoTriangulo.ESCALENO, escaleno.retornarTipo());
//}
//
//@Test
//public void testarLadoNegativo() {
//	Triangulo neg = new Triangulo(0,0,0);
//	Assert.assertEquals(TipoTriangulo.INVALIDO, neg.retornarTipo());
//}


//
//@Test(expected=RuntimeException.class)
//public void testarExcecao() {
//	Triangulo inv = new Triangulo( Integer.valueOf("999999999999999999"), 1, 3);
//}

