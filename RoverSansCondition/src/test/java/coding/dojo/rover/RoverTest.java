package coding.dojo.rover;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RoverTest {
	
	Rover rover;
	
	@Before
	public void setup(){
		rover = new Rover();
	}
	
	@Test
	public void avecRoverFaceNordQuandPivoterDroiteAlorsFaceEst(){
		rover.pivoterDroite();
		assertEquals(Orientation.EST, rover.orientation);
	}
	
	@Test
	public void avecRoverFaceNordQuandPivoterGaucheAlorsFaceOuest(){
		rover.pivoterGauche();
		assertEquals(Orientation.OUEST, rover.orientation);
	}
	
	@Test
	public void avecRoverFaceNord_0_0_QuandAvancer_1case_AlorsFaceNord_0_1(){
		rover.avancer(1);
		assertEquals(Orientation.NORD, rover.orientation);
		assertEquals(0, rover.position.x);
		assertEquals(1, rover.position.y);
	}
	
	@Test
	public void avecRoverFaceNord_0_0_QuandReculer_1case_AlorsFaceNord_0_moins1(){
		rover.reculer(1);
		assertEquals(Orientation.NORD, rover.orientation);
		assertEquals(0, rover.position.x);
		assertEquals(-1, rover.position.y);
	}
	
	@Test
	public void avecRoverFaceEst_1_1_QuandAvancer_2cases_AlorsFaceEst_3_1(){
		rover = new Rover(1,1,Orientation.EST);
		rover.avancer(2);
		assertEquals(Orientation.EST, rover.orientation);
		assertEquals(3, rover.position.x);
		assertEquals(1, rover.position.y);
	}
	
	@After
	public void teardown(){
	}

}
