import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class HelloWorld extends Application {
	
	//The app starts here
	 public static void main(String[] args) {
		 
		 // 1 :Requires this method
		 launch(args);// leave it as is it
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Stage = ( main window if the app)
		
		Button btn = new Button("Click me");
		//adding Action to the button
		// 1 = setAction
		btn.setOnAction( new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// 2 =
				System.out.println("Hello 2 ");
				
			}
			
			
		});
		
		
		
		//layouts = Stack pain / vertical box, horizontal box
		// 1  Stack pain (second main window of small Objects )
		StackPane root = new StackPane();
		
		root.getChildren().add(btn);
		
		// 2 Scene = Small Objects, with main window
		Scene scene = new Scene(root, 500,500);//500,500 = window size
		
		// 3 Bind with root
		primaryStage.setScene(scene);
		
		primaryStage.show(); // basic java Fx Window
	
		
	}

	
}
