package Controller;


import java.util.ArrayList;

import Model.Usuario;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class usuarioController {
	
	 private  ArrayList<Usuario> usuarios = new ArrayList<>();
	
	@FXML
    private TextField nombreUsuario;
	private String nombreU, contraseñaU;

	
	@FXML
	private PasswordField contraseñaUsuario;

	@FXML
    private Button registrarUsuario;
	
	@FXML
    private void openCarroForm() {
		Main.loadView("/View/carroFX.fxml");
    }
	
	private void showAlert(String title, String message) {
		Alert alert = new Alert(AlertType.INFORMATION); 
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
		}
	
	@FXML
    private void accionRegistrarUsuario(){
		
		usuarios.add(new Usuario("admin", "admin123"));
		usuarios.add(new Usuario("user1", "pass123"));
		usuarios.add(new Usuario("user2", "securePass"));
		usuarios.add(new Usuario("testUser", "test456"));
		usuarios.add(new Usuario("guest", "guest123"));
		
		nombreU = nombreUsuario.getText();
		contraseñaU = contraseñaUsuario.getText();

		
		if (nombreU.isBlank() || contraseñaU.isBlank()) {
            showAlert("Accion Invalida", "Complete todos los datos.");
            return;
        }

        boolean usuarioValido = false;

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombreUsuario().equals(nombreU) && usuarios.get(i).getContraseña().equals(contraseñaU)) {
                usuarioValido = true;
                break;
            }
        }

        if (usuarioValido) {
            clearFields();
            openCarroForm();
        } else {
            showAlert("Datos Incorrectos", "Ingrese los datos de inicio de sesión correctamente.");
            clearFields();
        }
        
    } void clearFields() {
		nombreUsuario.setText("");
		contraseñaUsuario.setText("");
	}
	
   }