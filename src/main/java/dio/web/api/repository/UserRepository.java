package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Usuario usuario){
        if(usuario.getId() == null){
            System.out.println("Save - Recebendo o usuário na camada de repository");
        }else{
            System.out.println("Update - Recebendo o usuário na camada de repository");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um registro%n", id);
    }

    public List<Usuario> findAll(){
        System.out.println("List - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Anderson", "123"));
        usuarios.add(new Usuario("Nascimento", "321"));

        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.printf("FIND/id - Recebendo o id: %d para retornar um registro", id);
        return new Usuario("Anderson", "123");
    }

    public Usuario findByUserName(String userName){
        System.out.printf("FIND/userName - Recebendo o username: %s para retornar um registro", userName);
        return new Usuario("Anderson", "123");
    }
}
