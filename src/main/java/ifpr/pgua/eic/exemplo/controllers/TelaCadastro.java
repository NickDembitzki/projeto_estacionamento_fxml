package ifpr.pgua.eic.exemplo.controllers;

import ifpr.pgua.eic.exemplo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastro {

    @FXML
    private TextField tfanodefabricacao;
    
       

    @FXML
    private TextField tfcor;

    @FXML
    private TextField tffabricante;

    @FXML
    private TextField tfmodelo;

    @FXML
    private TextField tfplaca;

    public TelaPrincipal Estacionamento;
        this.estacionamento = estacionamento;

    @FXML
    void cadastrar(ActionEvent event) {
    String placa = tfplaca.getText();
    String modelo  = tfmodelo.getText();
    String cor  = tfcor.getText();
    String fabricante = tfFabricante.getText();
    String sAno = tfAnoFabricacao.get.text();

    int ano = Integer. valueOf(sAno);


    }

    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();


    }

}

