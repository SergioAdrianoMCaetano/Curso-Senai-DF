package com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.repertorie;

import com.adriano.sergio.terceiroprojetospring.terceiroprojetospring.model.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

/*A EXTENÇÃO DA CLASSE "JPArEPOSITORY" INFORMA, ENTRE ÍCONES GENÉRICOS DO JAVA, A CLASSE/ENTIDADE ONDE SERÃO ARMAZENADAS
* AS INFORMAÇÕES, IDENTIFICADAS PELO TIPO ESPECIFICADO, INSERIDAS POR MEIO DA JPA/INTERFACE */
public interface LutadorRepository extends JpaRepository<Lutador, Integer> {


}
