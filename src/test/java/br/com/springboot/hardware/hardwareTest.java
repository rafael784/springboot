package br.com.springboot.hardware;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import br.com.springboot.model.Hardware;
import br.com.springboot.repository.HardwareRepository;

@SpringBootTest
@RunWith(SpringRunner.class)

public class hardwareTest {

	
	@Autowired
	private HardwareRepository hardwareRepository;
	
	@Test
	public void Hardware() {
		
		Hardware hardware = new Hardware();
		
		hardwareRepository.deleteAll();
		
		hardware.setMarca("Dell");
		hardware.setCpu("I5");
		hardware.setFoto("//path//");
		hardware.setHdMarca("sandisk");
		hardware.setHdTamanho(220);
		hardware.setMobo("Nvidia");
		hardware.setRam(4);
		hardware.setVeloCpu(1200);
		
		
		hardwareRepository.save(hardware);
		
		List<Hardware> retorno = hardwareRepository.findAll();
		
		assertEquals(retorno.stream().findFirst().get().getMarca(), "Dell");
		assertEquals(retorno.stream().findFirst().get().getCpu(), "I5");
		assertEquals(retorno.stream().findFirst().get().getFoto(), "//path//");
		assertEquals(retorno.stream().findFirst().get().getHdMarca(), "sandisk");
		assertEquals(retorno.stream().findFirst().get().getHdTamanho(), 220);
		assertEquals(retorno.stream().findFirst().get().getMobo(), "Nvidia");
		assertEquals(retorno.stream().findFirst().get().getRam(), 4);
		assertEquals(retorno.stream().findFirst().get().getVeloCpu(), 1200);
	

	}
	
}
