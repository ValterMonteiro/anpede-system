package br.com.anpede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.anpede.entities.EquipamentoItem;

@Repository
public interface EquipamentoItemRepository extends JpaRepository<EquipamentoItem, Long>{

}
