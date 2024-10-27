package org.marcosueda;

import java.util.logging.Logger;


public class BancoDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info(("Iniciou conexão"));
    }

    public static void finalizarConexao(){
        LOGGER.info(("Finalizou conexão"));
    }

    public static void inserirDados(Pessoa pessoa){
        LOGGER.info("Inseriu dados");
    }

    public static void removerDados(Pessoa pessoa){
        LOGGER.info("Removeu dados");
    }
}
