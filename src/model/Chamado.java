package model;

import sun.util.calendar.BaseCalendar.Date;

public class Chamado {
	
	public int id_chanado;	
	public String descricao;
	public String status;
	public Date dt_abertura;
	public Date dt_fechamento;
	public Fila fila;

	//get e set
	public int getId_chanado() {
		return id_chanado;
	}
	
	public void setId_chanado(int id_chanado) {
		this.id_chanado = id_chanado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getDt_abertura() {
		return dt_abertura;
	}
	
	public void setDt_abertura(Date dt_abertura) {
		this.dt_abertura = dt_abertura;
	}
	
	public Date getDt_fechamento() {
		return dt_fechamento;
	}
	
	public void setDt_fechamento(Date dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}
	
	public Fila getFila() {
		return fila;
	}
	
	public void setFila(Fila fila) {
		this.fila = fila;
	}

}
