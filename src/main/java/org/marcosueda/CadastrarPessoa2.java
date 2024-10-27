package org.marcosueda;

import java.time.LocalDate;

public class CadastrarPessoa2 {

    private ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa2(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa2 cadastrarPessoa2(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa2 pessoa2 = new Pessoa2(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscarDadosComBaseNoCep(cep);
        pessoa2.adicionaDadosDeEndereco(dadosLocalizacao);
        return pessoa2;
    }

}
