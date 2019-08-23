package demo.project.CBTCsjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TrainMapper implements RowMapper<Train> {

	public Train mapRow(ResultSet rs, int rowNum) throws SQLException {
		Train train = new Train();
		train.setId(rs.getInt("Id"));
		train.setLength(rs.getFloat("Length"));
		train.setType(rs.getString("Type"));
		return train;
	}

}
