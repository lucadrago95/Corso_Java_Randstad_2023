package com.example.Service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Membro;
import com.example.Repository.MembroRepository;

@Service
public class MembroService {
	
	@Autowired
	MembroRepository membroRepository;
	
	public Membro saveMembro(Membro membro) {
		return membroRepository.add(membro);
	}
	
	public Optional<Membro> findByIdMembro(Long id){
		return membroRepository.findById(id);
	}
	
	public void deleteMembro(Membro membro) {
		membroRepository.delete(membro);
	}
	
	public Membro updateMembro(Long id, Membro membro) {
		return membroRepository.update(id, membro);
		
	}
	
	// getLibri
	public Collection<Membro> getMembro(){
		return membroRepository.list();
	}
}
