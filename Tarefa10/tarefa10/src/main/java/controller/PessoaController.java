package controller;
import java.util.List;

import model.Pessoa;
import model.PessoaDAO;

public class PessoaController {

	PessoaDAO pessoaDAO;

    public PessoaController() {
        this.pessoaDAO = new PessoaDAO();
    }

    public Pessoa save(Pessoa pessoa){
        return this.pessoaDAO.save(pessoa);
    } 
    
    public List<Pessoa> findAll(){
    	return pessoaDAO.findAll();
    }
}