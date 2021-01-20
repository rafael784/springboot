package br.com.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.*;
public interface HardwareRepository extends JpaRepository<Hardware, Long> {


}
