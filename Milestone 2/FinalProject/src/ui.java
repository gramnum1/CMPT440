import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.io.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;
import javafx.stage.Popup;

public class ui extends Application {
	public finalP driver = new finalP();
	
	
	public void start(Stage stage) {
		VBox root=new VBox();
		final Popup savePop= new Popup(); savePop.setX(300); savePop.setY(200);
		final Popup loadPop= new Popup(); loadPop.setX(300); loadPop.setY(200);
		final HTMLEditor htmlEditor = new HTMLEditor();
		Button saveHTMLButton = new Button("save");
		Button loadHTMLButton = new Button("load");
	    root.setAlignment(Pos.TOP_CENTER);
	    /*Save button action */
	    saveHTMLButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override 
	            public void handle(ActionEvent arg0)  {
	            	try {
	            		TextInputDialog dialog = new TextInputDialog();
	            		dialog.setTitle("Save File");
	            		dialog.setHeaderText("Enter filename");
	            		dialog.setContentText("Please enter your filename:");
	            		Optional<String> result=dialog.showAndWait();
	            		if (result.isPresent()){
	            			String fn= result.toString();
	            			fn.replace("Optional[","");
	            			fn.replace("]","");
	               			save(result.get(),stripHTMLTags(htmlEditor.getHtmlText()));	
	            		}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            	
	            	
	                
	            }
	        });
	    /*load button action*/
	        loadHTMLButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override 
	            public void handle(ActionEvent arg0)  {
	            	try {
	            		TextInputDialog dialog = new TextInputDialog();
	            		dialog.setTitle("Load File");
	            		dialog.setHeaderText("Enter filename");
	            		dialog.setContentText("Please enter your filename:");
	            		Optional<String> result=dialog.showAndWait();
	            		if (result.isPresent()){
	            				            			
	            			String newTXT=load(result.get());
	            			htmlEditor.setHtmlText(getColor(newTXT));
	            			
	            			
	            		}
	            		
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            	
	            	
	                
	            }
	        });
	    root.getChildren().addAll(htmlEditor, saveHTMLButton, loadHTMLButton );
		stage.setTitle("Charles Harrison: Milestone 2");
        stage.setWidth(400);
        stage.setHeight(300);   
        htmlEditor.setPrefHeight(245);
        Scene scene = new Scene(root);       
        stage.setScene(scene);
        stage.show();
    
	/* handles coloring when enter is pressed*/
	htmlEditor.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>(){
		@Override
		public void handle(KeyEvent event){
			 if (event.getCode() == KeyCode.ENTER) {
			      htmlEditor.setHtmlText(getColor(htmlEditor.getHtmlText()));
		          event.consume();
		}
		}
		
	});
	}
	/*stripHTMLTags
	 * takes the html content of the editor
	 * and removes all html tags and 
	 * characters
	 * @param string htmlText
	 * @return string sb
	 */
	private String stripHTMLTags(String htmlText) {
		System.out.println("HTML: "+htmlText);

        Pattern pattern = Pattern.compile("<[^>]*>");
        Matcher matcher = pattern.matcher(htmlText);
        final StringBuffer sb = new StringBuffer(htmlText.length());
        while(matcher.find()) {
            matcher.appendReplacement(sb, "");
        }
        matcher.appendTail(sb);
        return sb.toString().replace("&nbsp;"," ").trim();

    }
	/*getColor
	 * takes the input 
	 * and formats it for color
	 * @param plain text
	 * @return htmlText
	 */
	public String getColor(String txt){
		
		String newText=stripHTMLTags(txt);
		String output=driver.process(newText);
		System.out.println(output);
		return output;	
	}
	
	/*save
	 * takes the content of html editor and saves
	 * it as a plain text file
	 * @params String result String cont
	 * @return none
	 */
	private static void save (String result, String cont)throws Exception{
		
		PrintStream out = new PrintStream(new FileOutputStream(result));
		System.setOut(out);
		System.out.println(cont);
		
		
		
	}
	/*load
	 * loads the contents
	 * of a txt file into the 
	 * html editor
	 * @param String fn 
	 * @return String res
	 */
	private static String load (String fn) throws IOException{
		String line=null;
		String res="";
		try{
			FileReader fr = new FileReader(fn);
			BufferedReader br= new BufferedReader(fr);
			while ((line=br.readLine()) !=null){
				res=line;
				
			}
			return res;
			
		}catch(FileNotFoundException ex){
			System.out.println("FNF");
			return "";
		}
		}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
