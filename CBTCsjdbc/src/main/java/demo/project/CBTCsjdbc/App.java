package demo.project.CBTCsjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext conxt = new AnnotationConfigApplicationContext(AppConfig.class);
    	TrainDAO trainDAO = conxt.getBean(TrainDAO.class);
    	
    	System.out.println("Listing All Trains");
    	
    	for (Train t : trainDAO.getAllTrain()) {
    		System.out.println(t);
    	}
       
    	System.out.println("/nGetting Train");
    	Train t1 = trainDAO.getTrainById(2);
    	System.out.println(t1);
    	
    	System.out.println("/nCreating Train");
    	Train t2 = new Train(3, 169.5f, "Gallopin");
    	System.out.println(t2);
    	trainDAO.getInsert(t2);
    	
    	for (Train t : trainDAO.getAllTrain()) {
    		System.out.println(t);
    	}
    	
    	System.out.println("/nUpdating Taing");
    	Train t3 = trainDAO.getTrainById(3);
    	t3.setLength(200);
    	t3.setType("Super-Express");
    	trainDAO.getUpdate(t3);
    	for (Train t : trainDAO.getAllTrain()) {
    		System.out.println(t);
    	}
    	 System.out.println("/nDeleting Train");
    	 Train t4 = trainDAO.getTrainById(3);
    	 trainDAO.getDelete(t4);
    	 for (Train t : trainDAO.getAllTrain()) {
     		System.out.println(t);
     	}
    	     conxt.close();
    }
    
}
