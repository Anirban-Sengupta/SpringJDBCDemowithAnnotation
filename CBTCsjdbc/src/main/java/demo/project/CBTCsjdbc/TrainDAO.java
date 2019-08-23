package demo.project.CBTCsjdbc;

import java.util.List;

public interface TrainDAO {

	List<Train> getAllTrain();
	Train getTrainById(int Id);
	public boolean getInsert(Train train);
	public boolean getUpdate(Train train);
	public boolean getDelete(Train train);
	
}
