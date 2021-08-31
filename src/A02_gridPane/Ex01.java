package A02_gridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

	public class Ex01 extends Application{
		public static void main(String[] args) {
			launch(args);
		}
		@Override
		public void start(Stage arg0) throws Exception {
			GridPane gridpane =new GridPane();
			Button btn =new Button("Button");
			GridPane.setConstraints(btn, 0, 0);
			
			Label label01 =new Label("Label 1");
			Label label02 =new Label("Label 2");
			GridPane.setConstraints(label02, 1, 1);

			GridPane.setConstraints(label01, 1, 2);
			gridpane.getChildren().addAll(btn,label01,label02);
			
			arg0.setScene(new Scene(gridpane,200,100));
			
			arg0.show();
		}
	}

