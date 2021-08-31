package A04_StackPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class Ex01 extends Application {
	public static void main(String[] args) {

			launch(args);
	}

		@Override
	public void start(Stage arg0) throws Exception {
			// TODO Auto-generated method stub
			StackPane sp =new StackPane();
			sp.getChildren().addAll(new Rectangle(100,100,Color.WHITE),new Label("Go!"));
			
			arg0.setScene(new Scene(sp,300,250));	
			
			//
			
			AnchorPane ap =new AnchorPane();
			ImageView iv =new ImageView("/img/smilerere.png");
			
			iv.setFitWidth(50);
			iv.setPreserveRatio(true);
			iv.setRotate(45);
			
			ap.getChildren().add(iv);
			arg0.setScene(new Scene(ap,300,200));
			
			
			arg0.show();
	}
}









