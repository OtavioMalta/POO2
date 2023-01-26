package br.com.trabalhofinal.model;

import java.util.HashMap;

import br.com.trabalhofinal.model.Enum.EnumModo;

public interface Fitter {
	
	public void fit(HashMap<String, String> params);
	public EnumModo getModo();
	public void setModo(EnumModo modo);
}
