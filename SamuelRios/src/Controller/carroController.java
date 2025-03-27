package Controller;

import java.util.ArrayList;

import Model.Carro;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class carroController {
	
	private  ArrayList<Carro> carros = new ArrayList<>();
	
	@FXML
    private TextField marcaCarro, modeloCarro, añoCarro, idCarro;
	private String marcaCa, modeloCa;
	private int añoCa, idCa;
	private boolean disponibleCa;
	
	
	@FXML
	private CheckBox siCarro;
	
	@FXML
	private CheckBox noCarro;
	
	@FXML
    private Button registrarCarro;
	@FXML
	private Button imprimirCarro;
	
	
	public carroController() {
        if (carros.isEmpty()) {
        	carros.add(new Carro("Toyota", "Corolla", 1001, 2020, true));
    		carros.add(new Carro("Honda", "Civic", 1002, 2019, false));
    		carros.add(new Carro("Ford", "Focus", 1003, 2021, true));
    		carros.add(new Carro("Chevrolet", "Cruze", 1004, 2018, true));
    		carros.add(new Carro("Nissan", "Sentra", 1005, 2022, false));
    		carros.add(new Carro("Volkswagen", "Jetta", 1006, 2020, true));
    		carros.add(new Carro("Hyundai", "Elantra", 1007, 2017, false));
    		carros.add(new Carro("Mazda", "3", 1008, 2021, true));
    		carros.add(new Carro("Kia", "Forte", 1009, 2019, true));
    		carros.add(new Carro("Subaru", "Impreza", 1010, 2022, false));
    		carros.add(new Carro("Tesla", "Model 3", 1011, 2023, true));
    		carros.add(new Carro("BMW", "Serie 3", 1012, 2020, false));
    		carros.add(new Carro("Mercedes-Benz", "Clase C", 1013, 2021, true));
    		carros.add(new Carro("Audi", "A4", 1014, 2018, true));
    		carros.add(new Carro("Lexus", "IS", 1015, 2022, false));
    		carros.add(new Carro("Volvo", "S60", 1016, 2019, true));
    		carros.add(new Carro("Porsche", "911", 1017, 2023, false));
    		carros.add(new Carro("Jaguar", "XE", 1018, 2021, true));
    		carros.add(new Carro("Infiniti", "Q50", 1019, 2020, true));
    		carros.add(new Carro("Acura", "TLX", 1020, 2022, false));
        }
    }
	
	private void showAlert(String title, String message) {
		Alert alert = new Alert(AlertType.INFORMATION); 
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
	
	@FXML
    private void accionRegistrarCarro() {
		
		
		marcaCa = marcaCarro.getText();
		modeloCa = modeloCarro.getText();
		String añoTexto = añoCarro.getText();
		String idTexto = idCarro.getText();
		
		if (marcaCa.isBlank() || modeloCa.isBlank() || añoTexto.isBlank() || idTexto.isBlank()) {
            showAlert("Accion invalida", "Rellene todos los campos.");
            return;
        }
		
		if (!siCarro.isSelected() && !noCarro.isSelected()) {
	        showAlert("Selección requerida", "Debe seleccionar si el carro está disponible o no.");
	        return;
	    }
		
		if(!idTexto.matches("^1[0-9]{3}$")) {
            showAlert("Id invalida", "Porfavor ingresa el id correctamente.");
               return;
       }
		
		idCa = Integer.parseInt(idTexto);
		
		if(!añoTexto.matches("^(19[0-9]{2}|20(0[0-9]|1[0-9]|2[0-5]))$")) {
            showAlert("Año invalido", "Porfavor ingresa el año correctamente.");
               return;
       }
		
		añoCa = Integer.parseInt(añoTexto);
		
		for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId() == (idCa)) {
            	showAlert("Id Repetido", "El id ya existe.");
                return;
            }
		}
		
		disponibleCa = siCarro.isSelected();
		
		carros.add(new Carro(marcaCa, modeloCa, idCa, añoCa, disponibleCa ));
	    showAlert("Completado", "Carro registrado correctamente!");
	    clearFields();
	    
	}
	
	
	@FXML
	private void accionImprimirCarro() {
	    for (int i = 0; i < carros.size(); i++) {
	    	Carro carro = carros.get(i); 
	    	if( carro.getDisponible()) {
	        System.out.println("Marca: " + carro.getMarca() + "Modelo: " + carro.getModelo() + "Año: " +carro.getAño() +  "Id: " + carro.getId());
	    	 }
	    }
	    System.out.println("\n");
	    return;
	}
	
	@FXML
	private void accionSiCarro(){
		if (siCarro.isSelected()) {
	        noCarro.setSelected(false);
	    } 
	}
	
	@FXML
	private void accionNoCarro() {
	    if (noCarro.isSelected()) {
	        siCarro.setSelected(false);
	    }
	}
	
	private void clearFields() {
		marcaCarro.setText("");
		modeloCarro.setText("");
		idCarro.setText("");
		añoCarro.setText("");
		siCarro.setSelected(false);
        noCarro.setSelected(false);
	}
		
	
}