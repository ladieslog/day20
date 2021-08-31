package A05_listView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane ap=new AnchorPane();
		ListView<String> listView =new ListView<String>();
		
		listView.getItems().addAll("item1","item2","itme3","list04");
		listView.setPrefSize(500, 500);		//t 질문
		listView.setLayoutX(10);
		listView.setLayoutY(10);
		
		ap.getChildren().add(listView);
		listView.setPrefSize(300, 300);
		
		
		arg0.setScene(new Scene(ap));
		arg0.show();
	}
}










