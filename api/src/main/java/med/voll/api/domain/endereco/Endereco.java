package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();

    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null) {
            this.logradouro = dados.bairro();
        }
        if (dados.cep() != null) {
            this.logradouro = dados.cep();
        }
        if (dados.numero() != null) {
            this.logradouro = dados.numero();
        }
        if (dados.complemento() != null) {
            this.logradouro = dados.complemento();
        }
        if (dados.cidade() != null) {
            this.logradouro = dados.cidade();
        }
        if (dados.uf() != null) {
            this.logradouro = dados.uf();
        }
    }
}
