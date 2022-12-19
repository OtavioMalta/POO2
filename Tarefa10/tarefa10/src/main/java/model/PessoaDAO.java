package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import config.SQLConnection;

public class PessoaDAO {
    static Connection connection = null;

    public PessoaDAO() { PessoaDAO.connection = SQLConnection.getConnection(); }

    public Pessoa save(Pessoa pessoa){
        String SQL = "insert into pessoa(nome,cpf) values ( ? , ? )";

        try{
            PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Pessoa> findAll(){
        String SQL = "SELECT * FROM pessoa";
        ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
        
        try {
            java.sql.Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while(rs.next()) {
                Pessoa m = new Pessoa();
                m.setNome(rs.getString("nome" ));
                m.setCpf(rs.getString("cpf"));
                Pessoas.add(m);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return Pessoas;
    }

}
