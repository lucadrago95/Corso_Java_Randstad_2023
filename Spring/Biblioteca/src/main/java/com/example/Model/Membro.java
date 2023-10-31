package com.example.Model;

import java.util.List;
import java.util.Objects;

public class Membro {
	private Long id;
	private String nome;
	private String cognome;
	private String email;
	private List<Prenotazione> prenotazioni;
	
	public Membro() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(List<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, email, id, nome, prenotazioni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membro other = (Membro) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(prenotazioni, other.prenotazioni);
	}

	@Override
	public String toString() {
		return "Membro [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", prenotazioni="
				+ prenotazioni + "]";
	}
	
	
	
}
