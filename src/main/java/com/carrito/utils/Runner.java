
package com.carrito.utils;
import com.carrito.entity.Authority;
import com.carrito.entity.Usuarios;
import com.carrito.repository.AuthorityRepository;
import com.carrito.repository.UsuariosRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Runner implements RunnerRun {
    private final UsuariosRepository usuariosRepository;
    private final AuthorityRepository authorityRepository;

    public Runner(UsuariosRepository usuariosRepository, AuthorityRepository authorityRepository) {
        this.usuariosRepository = usuariosRepository;
        this.authorityRepository = authorityRepository;
    }

    @Override
    public void run(String... args)throws Exception{
        if (this.authorityRepository.count() == 0){
            this.authorityRepository.saveAll(List.of(
                    new Authority(AuthorityName.ADMIN),
                    new Authority(AuthorityName.READ),
                    new Authority(AuthorityName.WRITE)
            ));
        }

        if (this.usuariosRepository.count() == 0){
            this.usuariosRepository.saveAll(List.of(
                    new Usuarios("Bryan","bosoriom7@hotmail.com", "123", List.of(this.authorityRepository.findByName(AuthorityName.ADMIN).get())),
                    new Usuarios("Andres","bosoriom77@hotmail.com", "1234", List.of(this.authorityRepository.findByName(AuthorityName.READ).get())),
                    new Usuarios("Osorio","bosoriom777@hotmail.com", "12345", List.of(this.authorityRepository.findByName(AuthorityName.WRITE).get())))
            );
        }
    }
}

