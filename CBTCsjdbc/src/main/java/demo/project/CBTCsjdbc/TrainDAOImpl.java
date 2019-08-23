package demo.project.CBTCsjdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import demo.project.CBTCsjdbc.Train;
import demo.project.CBTCsjdbc.TrainMapper;

@Component
public class TrainDAOImpl implements TrainDAO {
	
	private JdbcTemplate jdbcTemp;

	private final String GET_ALL_TRAIN = "select * from Train";
	private final String GET_TRAIN_BY_ID = "select * from Train WHERE Id = ?";
	private final String CREATE_TRAIN = "insert into Train (Id, Length, Type) values (?,?,?)";
	private final String UPDATE_TRAIN = "update Train set Length = ? , Type = ? WHERE Id = ?";
	private final String DELETE_TRAIN = "delete from Train WHERE id = ?";
	
	@Autowired
	public TrainDAOImpl(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate (dataSource);
	}

	public List<Train> getAllTrain() {
		return jdbcTemp.query(GET_ALL_TRAIN, new TrainMapper());
		
	}

	public Train getTrainById(int Id) {
		return jdbcTemp.queryForObject(GET_TRAIN_BY_ID, new Object[] {Id}, new TrainMapper());
	}

	public boolean getInsert(Train train) {
		return jdbcTemp.update(CREATE_TRAIN, train.getId(), train.getLength(), train.getType())>0;
	}

	public boolean getUpdate(Train train) {
		return jdbcTemp.update(UPDATE_TRAIN, train.getLength(), train.getType(), train.getId())>0;
	}

	public boolean getDelete(Train train) {
		return jdbcTemp.update(DELETE_TRAIN, train.getId())>0;
	}
}
